package com.example.infysurvey;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class InfySurvey {
    public static  void callWebview(WebView webView){
//        WebView webView1=webView;
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://surveys.infosysapps.com/r/a/OyYFznqvwezV");

    }
}
