package com.example.todo_8_ii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView receive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        receive = (TextView)findViewById(R.id.receive);
        Intent intent = getIntent();
        Uri url = intent.getData();
        if(url != null){
            String txt = url.toString();
            receive.setText(txt);
        }

    }
}