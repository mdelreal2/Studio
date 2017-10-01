package mariodelreal.studio;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
//import android.support.constraint.solver.SolverVariable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
//import org.w3c.dom.Text;

import org.w3c.dom.Text;

public class MarketPlaceActivity extends ActivityChangeHandler
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_place);

        ////////////////////
        //setting the art selection in the vertical scroll view on the display
        ////////////////////

        /*LinearLayout listOfArt = (LinearLayout)findViewById(R.id.list_off_art_linear_layout);

        TextView textView = new TextView(this);
        textView.setText("test");
        textView.setTextColor(Color.BLUE);

        listOfArt.addView(textView);*/

    }
}