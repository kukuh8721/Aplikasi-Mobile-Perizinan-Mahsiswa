package com.example.studentlicensing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Dasboard extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dasbord);

        imageView = (ImageView) findViewById(R.id.img_perizinan);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dasboard.this, Form.class);
                startActivity(intent);
            }
        });
        imageView = (ImageView) findViewById(R.id.img_acount);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dasboard.this, Acount.class);
                startActivity(intent);
            }
        });
        imageView = (ImageView) findViewById(R.id.img);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dasboard.this, Infoper.class);
                startActivity(intent);
            }
        });
        imageView = (ImageView) findViewById(R.id.imgg);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dasboard.this, Kami.class);
                startActivity(intent);
            }
        });
        imageView = (ImageView) findViewById(R.id.imggg);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dasboard.this, Contact.class);
                startActivity(intent);
            }
        });
    }
}
