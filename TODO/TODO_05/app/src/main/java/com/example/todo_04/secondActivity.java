package com.example.todo_04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.todo_04.MainActivity.EXTRA_SEND;

public class secondActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY = "com.example.todo_04.REPLY";
    TextView sender_textReceived;
    EditText replyer_input;
    String replyer_text,received_text;
    public static final String EXT_code_Activity2 = "log2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        sender_textReceived = (TextView)findViewById(R.id.text_receive02);
        Intent secondActivity_intent_reveived = getIntent();
        received_text = secondActivity_intent_reveived.getStringExtra(EXTRA_SEND);
        sender_textReceived.setText(received_text);

        Log.d(EXT_code_Activity2,"onCreate");
    }

    public void reply(View view) {
        replyer_input =(EditText)findViewById(R.id.replyer_input);
        replyer_text = replyer_input.getText().toString();
        Intent secondActivity_intent_obj = new Intent(this , MainActivity.class);
        secondActivity_intent_obj.putExtra(EXTRA_REPLY,replyer_text);
        setResult(RESULT_OK, secondActivity_intent_obj);
        finish();
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d(EXT_code_Activity2, "onStart");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d(EXT_code_Activity2, "onResume");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d(EXT_code_Activity2,"onPause");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d(EXT_code_Activity2,"onStop");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(EXT_code_Activity2,"onDestroy");
    }
}