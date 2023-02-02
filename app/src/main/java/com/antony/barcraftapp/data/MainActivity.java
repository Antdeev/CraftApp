package com.antony.barcraftapp.data;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.antony.barcraftapp.R;
import com.antony.barcraftapp.fragments.WhatIdDrinkFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WhatIdDrinkFragment whatIdDrinkFragment = new WhatIdDrinkFragment();

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.framelayout, whatIdDrinkFragment);
                ft.addToBackStack(null).commit();


    }
}