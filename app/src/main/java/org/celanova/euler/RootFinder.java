package org.celanova.euler;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.solvers.BrentSolver;

/**
 * Brent Solver thing
 * Created by Cory on 10/29/2014.
 */
public class RootFinder
{
    UnivariateFunction func;

    public static void main(String[] args)
    {
        //have this temporarily to test this out
        RootFinder f = new RootFinder();
        System.out.println("test");
    }

    public void setFunction(CalcData[] input)
    {
        //convert the CalcData into a UnivariateFunction

        func = new UnivariateFunction() {
            public double value(double x)
            {
                //fancy local class stuff
                return 0; //evaluate the function and return the value
            }
        };
    }

    public void compute()
    {
        BrentSolver solver = new BrentSolver();
        //make this do stuff
    }
}
