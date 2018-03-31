package com.example.user.history;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;

public class sub4 extends AppCompatActivity {
    WebView web4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub4);

        web4=(WebView)findViewById(R.id.web4);
        web4.getSettings().setJavaScriptEnabled(true);
        String stringurl4="https://drive.google.com/open?id=1MAtY8S5P22bkVNkxpx0soOSbba0bBf2X";
        web4.loadUrl(stringurl4);

        web4.setWebViewClient(new MyWebViewClient());
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




    public void back4(View view) {
        finish();
    }

    public void ques4(View view) {
        Intent q=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geva.co.il/bagrut_solution/history/"));
        startActivity(q);

    }
}
