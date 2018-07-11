package com.example.hb03_30.d3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView=(WebView)findViewById(R.id.webview);

        webView.loadUrl("file:///android_asset/test.html");

        imageView=(ImageView)findViewById(R.id.imageView);
        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(imageView);
    }
}
