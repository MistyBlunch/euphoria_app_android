package com.galvarado.serieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_data = (Button)findViewById(R.id.btn_data);
        LinearLayout data = (LinearLayout)findViewById(R.id.data);

        btn_data.setOnClickListener(
                view -> data.setVisibility(LinearLayout.VISIBLE)
        );

    }
}