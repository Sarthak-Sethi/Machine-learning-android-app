package com.example.imagelabellingml;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
Button imgdetectbtn,txtdetectbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgdetectbtn = findViewById(R.id.imgdetectbtn);
        txtdetectbtn = findViewById(R.id.txtdetectbtn);
        imgdetectbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,ImageDetect.class);
                startActivity(i);
            }
        });
        txtdetectbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CameraDetect.class);
                startActivity(i);
            }
        });
    }

}
