package org.celanova.euler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class CalcUI extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //Remove title bar
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //set content view AFTER ABOVE sequence (to avoid crash)
        //this.setContentView(R.layout.your_layout_name_here);

        setContentView(R.layout.activity_calc_ui);

        CalcIO.setOutputBoxes((TextView) findViewById(R.id.output),
                              (TextView) findViewById(R.id.lastEquation));

        createCalcButtonListener(R.id.num0);  //disgusting massive block to create listeners
        createCalcButtonListener(R.id.num1);  //for all of the basic calc buttons
        createCalcButtonListener(R.id.num2);
        createCalcButtonListener(R.id.num3);
        createCalcButtonListener(R.id.num4);
        createCalcButtonListener(R.id.num5);
        createCalcButtonListener(R.id.num6);
        createCalcButtonListener(R.id.num7);
        createCalcButtonListener(R.id.num8);
        createCalcButtonListener(R.id.num9);
        createCalcButtonListener(R.id.plus);
        createCalcButtonListener(R.id.minus);
        createCalcButtonListener(R.id.multiply);
        createCalcButtonListener(R.id.divide);

        //Intent intent = new Intent(this, ProgramUI.class);
        //startActivity(intent);
    }

    public void equalsPressed(View view)
    {
        CalcIO.submit();
    }

    private CalcButtonListener createCalcButtonListener(int id)
    {
        return new CalcButtonListener((Button) findViewById(id));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.calc_ui, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
