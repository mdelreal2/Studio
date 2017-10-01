package mariodelreal.studio;

import android.content.Context;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter
{
    private Context context;

    private Integer[] categoryIDs = {
            R.drawable.photography, R.drawable.paintings,
            R.drawable.sculptures, R.drawable.mixed_media,
            R.drawable.folk_art, R.drawable.prints,
            R.drawable.drawings, R.drawable.textiles,
            R.drawable.wood, R.drawable.ceramics,
            R.drawable.mosaics, R.drawable.pen_and_ink
    };

    public ImageAdapter(Context c, int[] images)
    {
        context = c;
    }

    @Override
    public int getCount()
    {
        return categoryIDs.length;
    }

    @Override
    public Object getItem(int position)
    {
        return position;
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ImageView imageView;

        if(convertView == null)
        {
            imageView = new ImageView(context);

            imageView.setAdjustViewBounds(true);
            //imageView.setLayoutParams(new GridView.LayoutParams(GridView.LayoutParams.WRAP_CONTENT, GridView.LayoutParams.WRAP_CONTENT));
            //imageView.setLayoutParams(new GridView.LayoutParams(GridView.LayoutParams.MATCH_PARENT, GridView.LayoutParams.MATCH_PARENT));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setScaleX((float) 0.90);
            imageView.setScaleY((float) 0.90);
            //imageView.setPadding(8, 8, 8, 8);
        }
        else
        {
            imageView = (ImageView)convertView;
        }

        imageView.setImageResource(categoryIDs[position]);

        return imageView;
    }
}
