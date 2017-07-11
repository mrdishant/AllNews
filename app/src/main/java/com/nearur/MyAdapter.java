package com.nearur;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nearur.allnews.Country;
import com.nearur.allnews.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mrdis on 7/11/2017.
 */

public class MyAdapter extends ArrayAdapter {
    Context context;
    int resource;
    ArrayList<Country> os;
    public MyAdapter(Context context, int resource, ArrayList<Country> objects) {
        super(context, resource, objects);
        this.context=context;
        this.os=objects;
        this.resource=resource;
    }
    public View getView(int position, View convertView,  ViewGroup parent) {
        View v= null;
        v= LayoutInflater.from(context).inflate(resource,parent,false);


        ImageView img=(ImageView) v.findViewById(R.id.imageViewCountry);
        TextView t=(TextView) v.findViewById(R.id.checkedTextViewCname);

        Country c=os.get(position);

        img.setBackgroundResource(c.getIc());
        t.setText(c.getName());

        return v;
    }
}
