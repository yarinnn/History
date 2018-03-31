package com.example.user.history;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;

public class sub2 extends AppCompatActivity {
    WebView web2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);

        web2=(WebView)findViewById(R.id.web2);
        web2.getSettings().setJavaScriptEnabled(true);
        String stringurl2="https://drive.google.com/open?id=1iDXPfOdeBU1ueT-i9apzyPE8o1YuSHRe";
        web2.loadUrl(stringurl2);

        web2.setWebViewClient(new MyWebViewClient());
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


    public void back2(View view) {
        finish();
    }

    public void ques2(View view) {
        Intent q=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geva.co.il/bagrut_solution/history/"));
        startActivity(q);
    }
}
