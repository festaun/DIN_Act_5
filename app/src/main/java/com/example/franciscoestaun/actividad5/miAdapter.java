package com.example.franciscoestaun.actividad5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by CurroEt on 24/11/2015.
 */
public class miAdapter extends BaseAdapter {
    private Context context;
    Integer[] imageIDs = {R.drawable.a59kyvmg, R.drawable.battle, R.drawable.bns1,
            R.drawable.bns2, R.drawable.bns3, R.drawable.battle,
            R.drawable.bns5, R.drawable.gengar, R.drawable.gw2,
            R.drawable.ori1, R.drawable.ori2, R.drawable.ori3,
            R.drawable.ori4, R.drawable.ori5, R.drawable.ori6,
            R.drawable.pokemon, R.drawable.op, R.drawable.battle};

    Activity_2 activity2;

    public miAdapter(Context c,Activity_2 activity_2) {
        context = c;
        this.activity2 = activity_2;
    }

    //---returns the number of images---
    public int getCount() {
        return imageIDs.length;
    }

    //---returns the ID of an item---
    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public String getFileName(int position) {
        return activity2.getResources().getResourceEntryName(imageIDs[position]);
    }
    //---returns an ImageView view---
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(150, 150));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(3, 3, 3, 3);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(imageIDs[position]);
        return imageView;
    }
}

