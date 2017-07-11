package com.nearur.allnews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.nearur.MyAdapter;

import java.util.ArrayList;

public class Region extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ArrayList<Country> c;
    ListView l1;
    MyAdapter adapter;
    void l1view() {
        l1=(ListView)findViewById(R.id.l1);
        c=new ArrayList<>();

        Country c1=new Country(R.drawable.india,"India");
        Country c2=new Country(R.drawable.america,"America");
        Country c3=new Country(R.drawable.australia,"Australia");
        Country c4=new Country(R.drawable.can,"Canada");
        Country c5=new Country(R.drawable.hungary,"Hungary");
        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);
        c.add(c5);
        adapter=new MyAdapter(this,R.layout.country_item,c);
        l1.setAdapter(adapter);
        l1.setOnItemClickListener(this);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region);
        l1view();
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent i=new Intent(this,Channel.class);
        switch(position){
            case  0:
                i.putExtra("name","India");
                break;
            case  1:
                i.putExtra("name","America");
                break;
            case  2:
                i.putExtra("name","Australia");
                break;
            case  3:
                i.putExtra("name","Canada");
                break;
            case  4:
                i.putExtra("name","Hungary");
                break;
        }
        startActivity(i);
    }
}
