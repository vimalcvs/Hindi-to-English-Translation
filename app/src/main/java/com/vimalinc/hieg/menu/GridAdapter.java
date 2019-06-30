package com.vimalinc.hieg.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.vimalinc.hieg.R;

/**
 * Created by VIMALCVS on 29.04.2019.
 */

public class GridAdapter extends BaseAdapter {

    // Declare Variables
    Context context;
    String[] Version;
    int[] image;
    LayoutInflater inflater;

    public GridAdapter(Context context, String[] version,int[] image) {
        this.context = context;
        this.Version = version;
        this.image = image;
    }

    @Override
    public int getCount() {
        return Version.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        // Declare Variables
        TextView gridtext;
        ImageView gridimage;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.grid_listview, parent, false);
        // Locate the TextViews in listview_item.xml
        gridtext = (TextView) itemView.findViewById(R.id.grid_text);
        // Locate the ImageView in listview_item.xml
        gridimage = (ImageView) itemView.findViewById(R.id.grid_image);
        // Capture position and set to the TextViews
        gridtext.setText(Version[position]);
        // Capture position and set to the ImageView
        gridimage.setImageResource(image[position]);
        return itemView;
    }
}
