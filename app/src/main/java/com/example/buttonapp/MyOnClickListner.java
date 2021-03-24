package com.example.buttonapp;

import android.view.View;

public class MyOnClickListner implements View.OnClickListener{
    MainActivity mainActivity;
    public MyOnClickListner(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View view) {
        mainActivity.mTextView1.setText("You clicked Hyejeong's button");
    }
}
