package com.example.user.history;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Subject extends AppCompatActivity {
    TextView logname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);

        logname=(TextView)findViewById(R.id.logname);

        InputStream is=null;
        boolean b=true;
        try {
            is= openFileInput("name.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            b=false;
        }

        InputStreamReader tmp= new InputStreamReader(is);
        BufferedReader reader= new BufferedReader(tmp);
        String str="";
        StringBuffer buffer=new StringBuffer();
        try {
            while ((str = reader.readLine()) !=null){
                buffer.append(str + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        logname.setText("שלום "+buffer);
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


    public void sub1(View view) {
        Intent t1=new Intent(this, sub1.class);
        startActivity(t1);

    }

    public void sub2(View view) {
        Intent t2=new Intent(this, sub2.class);
        startActivity(t2);
    }

    public void sub3(View view) {
        Intent t2=new Intent(this, sub3.class);
        startActivity(t2);

    }

    public void sub4(View view) {
        Intent t4=new Intent(this, sub4.class);
        startActivity(t4);
    }
}
