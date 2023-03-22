package com.example.part2_3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linear = new LinearLayout(this);
        Button bt = new Button(this);
        bt.setText("Button 1");
        linear.addView(bt);

        Button bt2 = new Button(this);
        bt2.setText("Button 2");
        linear.addView(bt2);

        setContentView(linear);
    }
}