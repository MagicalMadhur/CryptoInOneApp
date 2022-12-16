package com.techwithmadhur.cryptoinonenew;


import android.os.Bundle;
import android.view.KeyEvent;
import android.view.WindowManager;

import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class calsi extends AppCompatActivity {
    private WebView mWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_calsi);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        String url = "http://madhur65.pythonanywhere.com/calsi/Bitcoin";




        mWebview  = new WebView(this);
        mWebview.setWebViewClient(new WebViewClient() {
            public boolean shuldOverrideKeyEvent (WebView view, KeyEvent event) {
                return true;
            }

            public boolean shouldOverrideUrlLoading (WebView view, String url) {

                boolean Myvar = url.contains("https://www.coingecko.com/");
                return Myvar;
            }
        });

        mWebview.getSettings().setJavaScriptEnabled(true);

        mWebview .loadUrl(url);
        setContentView(mWebview );


    }


    @Override
    public void onBackPressed() {
        if (mWebview.canGoBack()) {
            mWebview.goBack();
        } else {
            super.onBackPressed();
        }
    }
}

