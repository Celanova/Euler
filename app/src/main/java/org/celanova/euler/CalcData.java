package org.celanova.euler;


/** Object for individual pieces of data that were inputted.
 *  An array of CalcData will be processed in some other class
 * Created by Cory on 10/10/2014.
 */
public class CalcData
{
    private String contents;
    private int type;

    public static final int NUM = 0, OP = 1, VAR = 2, FUNC = 3, PAR = 4, CMD = 5;

    public CalcData(String contents, int type)
    {
        this.contents = contents; //if this line confuses you, oh well
        this.type = type;
    }

    public String getContents() //yay encapsulation
    {
        return contents;
    }

    public int getType()
    {
        return type;
    }
}
