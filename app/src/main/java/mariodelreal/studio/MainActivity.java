package mariodelreal.studio;

import android.content.Intent;
import android.graphics.Typeface;
//import android.support.constraint.solver.SolverVariable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;
//import org.w3c.dom.Text;

public class MainActivity extends /*AppCompatActivity*/ActivityChangeHandler
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
    }

    //called when log in text box is clicked. will direct the user to the following activity
    public void gotoActivityNotifications(View view)
    {
        //Intent intent = new Intent(this, NotificationsActivity.class);
        Intent intent = new Intent(this, DiscoverActivityTest.class);
        startActivity(intent);
    }

    //called when the username field is clicked. if the text field has never been clicked before, set it to an empty character
    public void clearUsernameField(View view)
    {
        EditText editText = (EditText)view;
        String text = editText.getText().toString();
        if(text.equals("Username"))
        {
            editText.setText("");
        }
    }

    //called when the password field is clicked. if the text field has never been clicked before, set it to an empty character
    public void clearPasswordField(View view)
    {
        EditText editText = (EditText)view;
        String text = editText.getText().toString();
        if(text.equals("Password"))
        {
            editText.setText("");
        }
    }

}
