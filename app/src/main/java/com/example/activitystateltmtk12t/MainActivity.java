package com.example.activitystateltmtk12t;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tvNumber);
        Log.d("myActivity", "onCreate");
        if(savedInstanceState != null){
            count = savedInstanceState.getInt("myNumber",0);
        }
        tv.setText(String.valueOf(count));
    }

    public void increment(View view) {
        count ++;
        tv.setText(String.valueOf(count));
    }

    public void decrement(View view) {
        count --;
        tv.setText(String.valueOf(count));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("myNumber", count);
    }
}