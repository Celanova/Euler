package org.celanova.euler;

/**
 * lukie's unit machine
 */
public class UnitConverter
{
    public static void main(String[] args)
    {

        //this will run when the app starts
        final int FT = 1, M = 2, KM = 3, MI = 4, IN = 0;
        //in=0,ft=1,m=2,km=3,mi=4
        double number = 23;
        int unit = IN; //get button value
        int res = FT; //get button value
        switch(unit) {
            case IN:
                number = number * .0254;//converts to meters
                break;
            case FT: System.out.println("hello cruel world");
                number = number * .3048;
                break;
            case M:
                number = number * 1;
                break;
            case KM:
                number = number / 1000;
                break;
            case MI:
                number = number * 1609.34;
                break;
            default:
                break;
        }
        switch(res) {
            case IN:
                number = number / .0254;//converts away from meters
                break;
            case FT: System.out.println("hello cruel world");
                number = number / .3048;
                break;
            case M:
                number = number / 1;
                break;
            case KM:
                number = number * 1000;
                break;
            case MI:
                number = number / 1609.34;
                break;
            default:
                break;
        }

        System.out.println(number);


    }
}