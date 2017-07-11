package com.nearur;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nearur.allnews.Country;
import com.nearur.allnews.Paper;
import com.nearur.allnews.R;

import java.util.ArrayList;

/**
 * Created by mrdis on 7/11/2017.
 */
public class MyAdapter2 extends ArrayAdapter {
    Context context;
    int resource;
    ArrayList<Paper> os;

    public MyAdapter2(Context context, int resource, ArrayList<Paper> objects) {
        super(context, resource, objects);
        this.context=context;
        this.os=objects;
        this.resource=resource;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        View v= null;
        v= LayoutInflater.from(context).inflate(resource,parent,false);


        ImageView img=(ImageView) v.findViewById(R.id.imageViewPaper);
        TextView t=(TextView) v.findViewById(R.id.checkedTextViewPname);
        TextView t1=(TextView) v.findViewById(R.id.textViewPurl);

        Paper p=os.get(position);
        img.setBackgroundResource(p.getIcon());
        t.setText(p.getName());
        t1.setText(p.getUrl());

        return v;
    }
}
