/*******************************************************************************
 * GenAppAndroid
 * Copyright (C) 2017 Lars Helmuth Probst - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * This file is part of the project GenAppAndroid.
 *
 * @version 1.0 Release
 * @author Lars Helmuth Probst (Alienuser)
 * @copyright 2017 Lars Helmuth Probst
 * @link http://www.Lars-Probst.de
 ******************************************************************************/

package de.famprobst.genappandroid.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import de.famprobst.genappandroid.R;

public class Activity_Main extends AppCompatActivity {

    private static final String URL = "http://genappfrontend.mybluemix.net";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the WebViewer
        WebView myWebView = (WebView) findViewById(R.id.activityMain_webView);
        myWebView.setWebViewClient(new MyWebViewClient());

        // Set settings for the WebView
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Load the url
        myWebView.loadUrl(URL);
    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}


