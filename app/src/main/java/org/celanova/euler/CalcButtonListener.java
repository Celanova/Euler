package org.celanova.euler;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Created by Cory on 10/9/2014.
 */
public class CalcButtonListener implements OnClickListener
{
    Button button;

    public CalcButtonListener(Button b)
    {
        button = b;
        button.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        //this will need to change once multichar operations/functions (like sin/cos/tan) are used
        CalcIO.addUserInput(button.getText().charAt(0));
    }
}
