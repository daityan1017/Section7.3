package com.example.section73;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public abstract class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
