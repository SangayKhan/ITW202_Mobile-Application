package com.example.todo_09;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText n1,n2;
    TextView res;
    Button b1,b2,b3,b4;
    public Calculater obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText)findViewById(R.id.num1);
        n2 = (EditText)findViewById(R.id.num2);
        res = (TextView)findViewById(R.id.res);

        b1 = (Button)findViewById(R.id.add);
        b2 = (Button)findViewById(R.id.sur);
        b3 = (Button)findViewById(R.id.mul);
        b4 = (Button)findViewById(R.id.div);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

        obj = new Calculater();
    }

    public void ADD(double n1, double n2){
        res.setText(String.valueOf(obj.add(n1,n2)));
    }

    public void SUR(double n1, double n2){
        res.setText(String.valueOf(obj.sur(n1,n2)));
    }

    public void MUL(double n1, double n2){
        res.setText(String.valueOf(obj.mul(n1,n2)));
    }

    public void DIV(double n1, double n2){
        res.setText(String.valueOf(obj.div(n1,n2)));
    }

    @Override
    public void onClick(View v) {
        String no1 = n1.getText().toString();
        String no2 = n2.getText().toString();
        double nu1 =Double.valueOf(no1);
        double nu2 = Double.valueOf(no2);

        switch(v.getId()){
            case R.id.add:
                ADD(nu1,nu2);
                break;
            case R.id.sur:
                SUR(nu1,nu2);
                break;
            case R.id.mul:
                MUL(nu1,nu2);
                break;
            case R.id.div:
                DIV(nu1,nu2);
                break;
        }
    }
}