package com.example.hb03_30.d22;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView)findViewById(R.id.webview);
        webView.loadUrl("http://10.10.10.22:3000/p1.jpg");

        button1= (Button)findViewById(R.id.b1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView.loadUrl("http://10.10.10.22:3000/p2.jpg");
            }
        });
    }
}
