package com.techwithmadhur.cryptoinonenew;

import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class setAlert extends AppCompatActivity {
    private WebView mWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_set_alert);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        String url = "http://madhur65.pythonanywhere.com/alerts";




        mWebview  = new WebView(this);
        mWebview.setWebViewClient(new WebViewClient());

        mWebview.getSettings().setJavaScriptEnabled(true);

        mWebview .loadUrl(url);
        setContentView(mWebview );


    }
}

