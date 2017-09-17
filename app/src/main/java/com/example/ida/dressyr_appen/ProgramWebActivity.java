package com.example.ida.dressyr_appen;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

import com.example.ida.myapplication.R;

public class ProgramWebActivity extends AppCompatActivity {
    private static final String TAG = ProgramWebActivity.class.getCanonicalName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_web);

        WebView browser = (WebView) findViewById(R.id.web);

        browser.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {

                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {

                super.onPageFinished(view, url);
            }

            @Override
            public void onLoadResource(WebView view, String url) {
                super.onLoadResource(view, url);

                Log.d(TAG, "onLoadResource: Loaded " + url);
            }
        });

        Intent intent = getIntent();
        String url = intent.getStringExtra("url");

        browser.loadUrl(url);

        ActionBar bar = getSupportActionBar();

        if (bar != null)
            bar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        int id = item.getItemId();

        switch (id) {
            case R.id.start:
                startActivity(new Intent(this, MainActivity.class));
                return true;
            case R.id.kontakt:
                startActivity(new Intent(this, ContactActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
