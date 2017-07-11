package com.nearur.allnews;

import android.app.ProgressDialog;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.nearur.MyAdapter2;

import java.util.ArrayList;
import java.util.List;

public class NewsView extends AppCompatActivity {
    WebView wb;
    ProgressBar progressBar;

    public void w1() {
        wb = (WebView) findViewById(R.id.w1);
        progressBar=(ProgressBar)findViewById(R.id.p1);
        WebViewClient cl = new WebViewClient();
        wb.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                progressBar.setProgress(progress);
                if (progress == 100) {
                    progressBar.setVisibility(View.GONE);
                    getSupportActionBar().hide();

                } else {
                    progressBar.setVisibility(View.VISIBLE);

                }
            }
        });
        wb.setWebViewClient(cl);
        wb.getSettings().setJavaScriptEnabled(true);
        String u = getIntent().getStringExtra("URL");
        wb.loadUrl(u);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String t=getIntent().getStringExtra("Name");
        getSupportActionBar().setTitle(t);
        setContentView(R.layout.activity_news_view);
        w1();
    }
}

