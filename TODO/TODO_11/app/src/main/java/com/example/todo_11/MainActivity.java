package com.example.todo_11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b1;
    TextView t1;
    String[] colorArray = {"purple_200","purple_500","purple_700","teal_200","teal_700","black"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.b1);
        t1 = (TextView)findViewById(R.id.t1);
    }

    public void change(View v){
        Random rendom = new Random();
        String color = colorArray[rendom.nextInt(colorArray.length-1)];
        int colorRrs = getResources().getIdentifier(color, "color",getApplicationContext().getPackageName());
        t1.setTextColor(ContextCompat.getColor(this,colorRrs));
    }
}