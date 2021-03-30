package com.example.buttonwiinnerclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mButton1, mButton2;
    TextView mTextview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = findViewById(R.id.button1);
        mButton2 = findViewById(R.id.button2);

        mTextview1 = findViewById(R.id.textView1);

        mButton1.setOnClickListener(new MyOnClickListener());
        mButton2.setOnClickListener(new MyOnClickListener2());

    }

    class MyOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            mTextview1.setText("You clicked YH's button!");
        }
    }


    private class MyOnClickListener2 implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            mTextview1.setText("You clicked YH's button!");
        }
    }

}
