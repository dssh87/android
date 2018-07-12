package com.example.hb03_30.no24;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView)findViewById(R.id.webView);
        webView.loadUrl("http://m.yes24.com/?appname=ANDROIDPHONECOMMERCE");
        webView.setClickable(true);
        webView.setWebViewClient(new MyWebViewClient());


        WebSettings webSettings = webView.getSettings();

        webSettings.setJavaScriptEnabled(true);
    }

    class MyWebViewClient extends WebViewClient{

    }
}
