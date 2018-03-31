package com.example.user.history;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Credits extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        text=(TextView)findViewById(R.id.text);

        text.setText("קרדיט לירין כהן, בטי משעלי ויואל גבע");

    }
}
