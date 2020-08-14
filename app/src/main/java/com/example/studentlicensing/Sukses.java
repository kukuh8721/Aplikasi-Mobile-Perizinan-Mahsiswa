package com.example.studentlicensing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Sukses extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_sukses);

        button = (Button) findViewById(R.id.btn_sukses);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sukses.this, Dasboard.class);
                startActivity(intent);
            }
        });
    }
}
