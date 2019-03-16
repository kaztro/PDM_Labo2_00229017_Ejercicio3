package com.example.pdm_labo2_00229017_e3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.b1_id);
        Button btn2 = findViewById(R.id.b2_id);
        Button btn3 = findViewById(R.id.b3_id);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b1_id:
                v.setBackgroundColor(Color.CYAN);
                break;
            case R.id.b2_id:
                break;
            case R.id.b3_id:
                break;
            default:
                break;
        }
    }
}
