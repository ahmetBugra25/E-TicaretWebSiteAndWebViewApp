package com.example.gebzeisguvenligi;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient()); // Linklerin WebView içinde açılmasını sağlar

        // WebView ayarları
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // JavaScript'i etkinleştirir

        // WebView'de açılacak URL
        webView.loadUrl("https://gebzeisguvenligi.com/"); // Burada istediğiniz URL'yi yazabilirsiniz
    }

    @Override
    public void onBackPressed() {
        // Geri tuşuna basıldığında WebView'de geri gitme
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}