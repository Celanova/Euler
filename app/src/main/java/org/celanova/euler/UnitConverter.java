package org.celanova.euler;

/**
 * lukie's unit machine
 */
public class UnitConverter
{
    public static void main(String[] args)
    {

        //ThatUnitConverterGuy//
        //int factor[ft,in,mi,km,cm,m]//
        //int number = getkey "whatever cory does"//
        //int initialUnit = getkey//
        //int finalUnit = getkey//
        int number = 1;
        int initialUnit = 1;
        int finalUnit = 6;
        double factor[] = {.3048, .0254, 1609.34, 1000, .01, 1};
        double meters = factor[initialUnit] * number;
        double numberRes = meters * factor[finalUnit];
        System.out.println(numberRes);
        System.out.println(numberRes);
 


    }
}
