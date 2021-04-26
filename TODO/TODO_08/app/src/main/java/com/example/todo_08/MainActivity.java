package com.example.todo_08;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{
    EditText txt1,txt2,txt3;
    Button button1,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (EditText)findViewById(R.id.txt1);
        txt2 = (EditText)findViewById(R.id.txt2);
        txt3 = (EditText)findViewById(R.id.txt3);
    }


    public void website(View view) {
        String web = txt1.getText().toString();
        Uri uri = Uri.parse(web);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);

        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }else{
            Log.d("implicit intent","Intent not working");
        }
    }

    public void location(View view) {
        String location = txt2.getText().toString();
        Uri uri = Uri.parse("geo:0?0q = "+location);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);

        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }else{
            Log.d("implicit intent","Intent not working");
        }
    }

    public void shareText(View view) {
        String share = txt1.getText().toString();
        String miniType = "text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(miniType)
                .setChooserTitle("Share This text with: ")
                .startChooser();

    }
}