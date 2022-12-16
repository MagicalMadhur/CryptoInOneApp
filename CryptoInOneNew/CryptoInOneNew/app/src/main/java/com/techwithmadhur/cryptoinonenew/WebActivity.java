package com.techwithmadhur.cryptoinonenew;

//
//import android.os.Bundle;
//import android.view.KeyEvent;
//import android.view.WindowManager;
//
//import android.webkit.WebView;
//import android.webkit.WebViewClient;
//import android.widget.ImageView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class WebActivity extends AppCompatActivity {
//    private WebView mWebview;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
//        String url = "http://madhur65.pythonanywhere.com/";
//
//
//
//
//
//
//          mWebview  = new WebView(this);
//
//
//        mWebview.setWebViewClient(new WebViewClient() {
//            public boolean shuldOverrideKeyEvent (WebView view, KeyEvent event) {
//                return true;
//            }
//
//            public boolean shouldOverrideUrlLoading (WebView view, String url) {
//
//                boolean Myvar = url.contains("https://www.coingecko.com/");
//                return Myvar;
//            }
//        });
//
//        mWebview.getSettings().setJavaScriptEnabled(true);
//
//        mWebview .loadUrl(url);
//        setContentView(mWebview );
//
//
//    }
//
//
//    @Override
//    public void onBackPressed() {
//        if (mWebview.canGoBack()) {
//            mWebview.goBack();
//        } else {
//            super.onBackPressed();
//        }
//    }
//}
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://www.google.com");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }