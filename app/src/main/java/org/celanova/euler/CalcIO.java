package org.celanova.euler;

import java.util.ArrayList;
import android.widget.TextView;

/**
 * Created by Cory on 10/10/2014.
 */
public class CalcIO
{
    private static ArrayList<CalcData> calcData = new ArrayList<CalcData>();
    private static String currentInput = "";
    private static TextView output, lastEquation;

    public static void setOutputBoxes(TextView out, TextView last)
    {
        output = out;
        lastEquation = last;
    }

    public static void addUserInput(char input)
    {
        currentInput += input;

        lastEquation.setText(""); //idk what to do with this one, should ask george

        try{ //test if it's a number
           Double.parseDouble(currentInput);
        } catch(NumberFormatException e){
            if(currentInput.length() == 1)
            {
                int type;
                if(((int) input) > 64) //if it's a letter
                    type = CalcData.VAR;
                else
                    type = CalcData.OP;
                calcData.add(new CalcData(currentInput, type));
                currentInput = "";
            }
            else
            {   //chop off the last character
                calcData.add(new CalcData(currentInput.substring(0,currentInput.length()-1), CalcData.NUM));
                currentInput = "";
                addUserInput(input); //somewhat gross use of semi-recursion, might change this
            }
        }

        output.setText(getDataString() + currentInput);
        //debug
        //for(CalcData d : calcData)
        //    System.out.println(d.getContents() + ", which is of type " + d.getType());
    }

    /**
     * Invoked when equals is pushed
     */
    public static void submit()
    {
        if(!currentInput.isEmpty()) //add any numbers not yet added
            calcData.add(new CalcData(currentInput, CalcData.NUM));
        lastEquation.setText(output.getText() + "=");
        output.setText(Double.toString(CalcSolver.solve(
                                       calcData.toArray(new CalcData[calcData.size()]))));
        //this last long line sends all calc data to the solver class, then outputs the result

        currentInput = "";
        calcData.clear();
    }

    /**
     * Converts whatever has been inputted (calcdata) to a string.
     * @return All the calcdata as a string
     */
    public static String getDataString()
    {
        String s = "";
        for(CalcData d : calcData)
            s += d.getContents();

        return s;
    }
}
