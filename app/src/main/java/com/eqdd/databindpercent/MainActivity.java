package com.eqdd.databindpercent;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.eqdd.databindpercent.MainActivityCustom da=  DataBindingUtil.setContentView(this,R.layout.activity_main);
    }
}
