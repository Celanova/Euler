package org.celanova.euler;

/**
 * Takes an equation and solves it.
 * For David and Lukas
 * Created by Cory on 10/10/2014.
 */
public class CalcSolver
{
    //type = 0 means num
    //type = 1 means operation
    //type = 2 means variable

    public static double solve(CalcData[] allCalcData)
    {
        double result = 0;

        for(CalcData data : allCalcData)
        {
            //goes through every piece of data and gets the contents/type
            //like going through a while loop and continuously asking for user input
            String contents = data.contents;
            int type = data.type;
            if(type == 0)
        }

        return result; //this sends the result back to the interface to be displayed
    }
}
