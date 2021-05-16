package com.example.todo_14_ii;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button mAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAlert = findViewById(R.id.alert);

        mAlert.setOnClickListener(v -> {
            AlertDialog.Builder alertobj = new AlertDialog.Builder(this);
            alertobj.setTitle("Alert");
            alertobj.setCancelable(true);
            alertobj.setMessage("Click OK to continue or cancel to stop");

            alertobj.setPositiveButton("Ok", (dialog, which) ->
                    Toast.makeText(this,"Pressed Ok",Toast.LENGTH_LONG).show()
            );

            alertobj.setNegativeButton("Cancel", (dialog, which) ->
                    Toast.makeText(this,"Pressed Cancel",Toast.LENGTH_LONG).show()
            );
            alertobj.show();
        });
    }
}