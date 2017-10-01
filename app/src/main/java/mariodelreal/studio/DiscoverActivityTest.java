package mariodelreal.studio;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class DiscoverActivityTest extends ActivityChangeHandler
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover_test);

        //Make sure the search bar doesn't automatically bring up the keyboard
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        /*TableLayout tableLayout = (TableLayout) findViewById(R.id.categories_table_layout);

        int images[] = {R.drawable.mosaics, R.drawable.ceramics, R.drawable.pen_and_ink, R.drawable.wood, R.drawable.textiles, R.drawable.drawings, R.drawable.prints, R.drawable.folk_art, R.drawable.mixed_media, R.drawable.sculptures, R.drawable.paintings, R.drawable.photography};

        int counter = 0;

        for(int i = 0; i < 6; i++)
        {
            TableRow row = new TableRow(this);
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.set
            for(int j = 0; j < 2; j++)
            {
                TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.MATCH_PARENT);
                row.setLayoutParams(lp);

                ImageView imageView = new ImageView(this);

                imageView

                //ViewGroup.LayoutParams imageViewParams = new ViewGroup.LayoutParams(300, 300);
                //imageView.setLayoutParams(imageViewParams);

                /*imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setScaleX((float)0.5);
                imageView.setScaleY((float)0.5);
                imageView.setAdjustViewBounds(false);

                //imageView.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT,
                //        TableRow.LayoutParams.WRAP_CONTENT));

                //ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) imageView.getLayoutParams();
                //layoutParams.width = 75;
                //layoutParams.height = 75;
                //layoutParams.width = (ViewGroup.LayoutParams.MATCH_PARENT / 2);
                //layoutParams.height = (ViewGroup.LayoutParams.MATCH_PARENT / 2);
                //imageView.setLayoutParams(layoutParams);


                imageView.setImageResource(images[counter]);
                row.addView(imageView);
                counter++;
            }
            tableLayout.addView(row);
        }*/

    }
}
