package com.example.part2_3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lab3_3Activity extends AppCompatActivity implements View.OnClickListener {
    Button trueBtn;
    TextView targetTextView;
    Button falseBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab33);
        //View 객체 획득
        trueBtn=findViewById(R.id.btn_visible_true);
        targetTextView = findViewById(R.id.text_visible_target);
        falseBtn = findViewById(R.id.btn_visible_false);

        //Button Event 등록
        trueBtn.setOnClickListener(this);
        falseBtn.setOnClickListener(this);
    }

    //Button Event Callback 함수
    public void onClick(View v){
        if(v==trueBtn){
            //trueBtn이 눌리면 targetTextView를 visible한 상태로 변경
            targetTextView.setVisibility(View.VISIBLE);
        }else if(v==falseBtn){
            targetTextView.setVisibility(View.INVISIBLE);
        }
    }

}