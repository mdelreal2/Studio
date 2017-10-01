package mariodelreal.studio;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DiscoverActivity extends ActivityChangeHandler
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);

        //Make sure the search bar doesn't automatically bring up the keyboard
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        //Populate the ScrollView holding the LinearLayout
        LinearLayout layout = (LinearLayout)findViewById(R.id.picks_for_you_linear_layout);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(300, LinearLayout.LayoutParams.MATCH_PARENT);
        layoutParams.setMargins(10, 0, 10, 0);

        ImageView imageView1 = new ImageView(this);
        imageView1.setBackgroundResource(R.drawable.folk_art);
        imageView1.setLayoutParams(layoutParams);

        ImageView imageView2 = new ImageView(this);
        imageView2.setBackgroundResource(R.drawable.mosaics);
        imageView2.setLayoutParams(layoutParams);

        ImageView imageView3 = new ImageView(this);
        imageView3.setBackgroundResource(R.drawable.ceramics);
        imageView3.setLayoutParams(layoutParams);

        layout.addView(imageView1);
        layout.addView(imageView2);
        layout.addView(imageView3);

        //Populate the GridView
        GridView gridView = (GridView)findViewById(R.id.grid_view_layout);

        int images[] = {R.drawable.mosaics, R.drawable.ceramics, R.drawable.pen_and_ink, R.drawable.wood, R.drawable.textiles, R.drawable.drawings, R.drawable.prints, R.drawable.folk_art, R.drawable.mixed_media, R.drawable.sculptures, R.drawable.paintings, R.drawable.photography};

        ImageAdapter imageAdapter = new ImageAdapter(getApplicationContext(), images);

        gridView.setAdapter(imageAdapter);
    }
}
