package com.example.blueprint;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.loadUrl("https://www.google.com");
    }
}