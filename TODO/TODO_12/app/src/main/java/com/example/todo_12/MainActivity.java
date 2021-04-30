package com.example.todo_12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    String _no = "17000000";
    ImageView img1,img2,img3;
    Bitmap bitmap1,bitmap2,bitmap3;
    FloatingActionButton call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = (ImageView)findViewById(R.id.img1);
        img2 = (ImageView)findViewById(R.id.img2);
        img3 = (ImageView)findViewById(R.id.img3);

        bitmap1 = new BitmapFactory().decodeResource(getResources(), R.drawable.donut);
        RoundedBitmapDrawable makeRound1 = RoundedBitmapDrawableFactory.create(getResources(),bitmap1);
        makeRound1.setCircular(true);
        img1.setImageDrawable(makeRound1);

        bitmap2 = new BitmapFactory().decodeResource(getResources(), R.drawable.icecreamsan);
        RoundedBitmapDrawable makeRound2 = RoundedBitmapDrawableFactory.create(getResources(),bitmap2);
        makeRound2.setCircular(true);
        img2.setImageDrawable(makeRound2);

        bitmap3 = new BitmapFactory().decodeResource(getResources(), R.drawable.icecream);
        RoundedBitmapDrawable makeRound3 = RoundedBitmapDrawableFactory.create(getResources(),bitmap3);
        makeRound3.setCircular(true);
        img3.setImageDrawable(makeRound3);

        call = (FloatingActionButton)findViewById(R.id.call);
        call.setOnClickListener(v -> {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("tel://"+_no)));
        });

    }

    public void donut(View v){
        displayToast("You ordered an donut");
    }

    public void iceCreamSan(View v){
        displayToast("You ordered an ice cream sandwich");
    }

    public void iceCream(View v){
        displayToast("You ordered an ice cream");
    }

    public void displayToast(String txt){
        Toast.makeText(this, txt, Toast.LENGTH_SHORT).show();
    }
}