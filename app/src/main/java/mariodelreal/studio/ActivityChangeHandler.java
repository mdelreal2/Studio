package mariodelreal.studio;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.icu.text.DisplayContext;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import static mariodelreal.studio.R.string.s;
import static mariodelreal.studio.R.string.tudio;

public abstract class ActivityChangeHandler extends Activity
{
    //pass in a TextView and have its font be changed to playfair
    public void setPlayfairFont(TextView s)
    {
        Typeface tf1 = Typeface.createFromAsset(getAssets(), "PlayfairDisplay-Regular.otf");
        s.setTypeface(tf1);
    }

    //pass in a TextView and have its font be changed to alex brush
    public void setAlexBrushFont(TextView tudio)
    {
        Typeface tf2 = Typeface.createFromAsset(getAssets(), "AlexBrush-Regular.ttf");
        tudio.setTypeface(tf2);
    }

    public void changeToMarketPlace(View view)
    {
        Intent intent = new Intent(this, MarketPlaceActivity.class);
        startActivity(intent);
    }

    public void changeToDiscover(View view)
    {
        Intent intent = new Intent(this, DiscoverActivityTest.class);
        startActivity(intent);
    }

    public void changeToCamera(View view)
    {
        Intent intent = new Intent(this, CameraActivity.class);
        startActivity(intent);
    }

    public void changeToNotifications(View view)
    {
        Intent intent = new Intent(this, NotificationsActivity.class);
        startActivity(intent);
    }

    public void changeToHome(View view)
    {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

}
