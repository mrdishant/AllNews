package com.nearur.allnews;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.nearur.MyAdapter2;

import java.util.ArrayList;

public class Channel extends AppCompatActivity  {
    ListView l2;
    MyAdapter2 adapter2;
    ArrayList<Paper> a;

    void l2view() {
        l2 = (ListView) findViewById(R.id.l2);
        String s = getIntent().getStringExtra("name");
        a = new ArrayList<>();
        Paper p1, p2, p3, p4, p5;
        switch (s) {
            case "India":
                p1 = new Paper(R.drawable.a1, "AajTak", "http://aajtak.intoday.in/");
                p2 = new Paper(R.drawable.abp, "ABP News", "http://abpnews.abplive.in/");
                p3 = new Paper(R.drawable.a3, "BBC News", "http://www.bbc.com/");
                p4 = new Paper(R.drawable.a4, "CNN", "http://edition.cnn.com/");
                p5 = new Paper(R.drawable.a5, "Zee News", "http://zeenews.india.com/");
                a.add(p1);
                a.add(p2);
                a.add(p3);
                a.add(p4);
                a.add(p5);
                break;


            case "America":
                p1 = new Paper(R.drawable.b1, "Fox News", "http://www.foxnews.com/");
                p2 = new Paper(R.drawable.b2, "NBC News", "http://www.nbcnews.com/");
                p3 = new Paper(R.drawable.b3, "CBS News", "http://www.cbsnews.com/");
                a.add(p1);
                a.add(p2);
                a.add(p3);
                break;

            case "Australia":
                p1 = new Paper(R.drawable.c1, "CTV News", "http://www.ctvnews.ca/");
                a.add(p1);
                break;


            case "Canada":
                p1 = new Paper(R.drawable.d1, "Sky News", "http://news.sky.com/");
                p2 = new Paper(R.drawable.d2, "ABC News", "http://abcnews.go.com/");
                p3 = new Paper(R.drawable.d3, "7 News", "https://au.news.yahoo.com/");
                a.add(p1);
                a.add(p2);
                a.add(p3);
                break;


            case "Hungary":
                p1 = new Paper(R.drawable.e1, "HirTv", "http://hirtv.hu/");
                p2 = new Paper(R.drawable.e2, "Channel 4", "http://www.channel4.com/");
                a.add(p1);
                a.add(p2);
                break;
        }
        adapter2 = new MyAdapter2(this, R.layout.paper_item, a);
        l2.setAdapter(adapter2);
        l2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(Channel.this, NewsView.class);
                String u = a.get(position).getUrl();
                String n=a.get(position).getName();
                i.putExtra("URL", u);
                i.putExtra("Name",n);
                startActivity(i);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String na=getIntent().getStringExtra("name");
        getSupportActionBar().setTitle(na);
        setContentView(R.layout.activity_channel);
        l2view();
    }

}
