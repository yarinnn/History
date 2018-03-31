package com.example.user.history;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class sub1 extends AppCompatActivity {
    WebView web;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);

        web=(WebView)findViewById(R.id.web);
        web.getSettings().setJavaScriptEnabled(true);
        String stringurl="https://drive.google.com/open?id=1aN321kM7-vliRx3x1ES1DuqI1i_mV1Lq";
        web.loadUrl(stringurl);

        web.setWebViewClient(new MyWebViewClient());

    }
    public boolean onCreateOptionsMenu (android.view.Menu menu){

        getMenuInflater().inflate(R.menu.main , menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id==R.id.credits){
            Intent credits= new Intent(this, Credits.class);
            startActivity(credits);
        }
        return true;

    }


    public void back(View view) {
        finish();
    }

    public void ques1(View view) {
        Intent q=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geva.co.il/bagrut_solution/history/"));
        startActivity(q);
    }
}
