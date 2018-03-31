package com.example.user.history;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;

public class Login extends AppCompatActivity {
    EditText name;
    AlertDialog.Builder adb;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        adb=new AlertDialog.Builder(this);

        name=(EditText)findViewById(R.id.name);

        InputStream is;
        boolean b=true;
        try {
            is= openFileInput("name.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            b=false;
        }

        if (b==true){
            Intent t5=new Intent(this, Subject.class);
            startActivity(t5);
        }



    }
    @Override
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

    public void Cont(View view) {
        if (name.getText().toString().equals("") || name.getText().toString().equals(".")) {
            adb.setTitle("שגיאה");
            adb.setMessage("בדוק האם הכנסת שם כראוי");
            adb.setIcon(R.drawable.mark);
            adb.setPositiveButton("תקן", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            AlertDialog ad = adb.create();
            ad.show();
        } else {

                FileOutputStream fos = null;
                String st = name.getText().toString();

                try {
                    fos = openFileOutput("name.txt", Context.MODE_PRIVATE);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                BufferedWriter bw = new BufferedWriter(osw);
                try {
                    bw.write(st);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Intent t5 = new Intent(this, Subject.class);
                startActivity(t5);
            }
        }
    }
