package com.nearur.allnews;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ListView;
import android.widget.Toast;

import com.nearur.MyAdapter2;

import java.util.ArrayList;
import java.util.List;

public class NewsView extends AppCompatActivity {
    WebView wb;
    

    public void w1() {
        wb = (WebView) findViewById(R.id.w1);
        WebViewClient cl = new WebViewClient();
        wb.setWebViewClient(cl);
        wb.getSettings().setJavaScriptEnabled(true);
        String u = getIntent().getStringExtra("URL");
        wb.loadUrl(u);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_view);
        w1();
    }
}

