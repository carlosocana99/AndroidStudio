package com.example.projecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Activity2 extends AppCompatActivity {
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        web=(WebView)findViewById(R.id.web);
        Bundle bundle = getIntent().getExtras();
        String dato=bundle.getString("URL");
        web.loadUrl("https://"+dato);
    }

    public void go(View v){
        finish();
    }

    }
