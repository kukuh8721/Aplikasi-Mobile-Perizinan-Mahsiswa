package com.example.studentlicensing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Infoper extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infoper);

        imageView = (ImageView) findViewById(R.id.infor_perizinan);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Infoper.this, Satuhari.class);
                startActivity(intent);
            }
        });
        imageView = (ImageView) findViewById(R.id.perizinan);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Infoper.this, Tigahari.class);
                startActivity(intent);
            }
        });
        imageView = (ImageView) findViewById(R.id.tentang_kami);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Infoper.this, Satuminggu.class);
                startActivity(intent);
            }
        });
        imageView = (ImageView) findViewById(R.id.kontak_kami);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Infoper.this, Satubulan.class);
                startActivity(intent);
            }
        });
    }
}
