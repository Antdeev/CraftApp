package com.antony.barcraftapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.antony.barcraftapp.R;


public class WhatIdDrinkFragment extends Fragment {

    ImageButton whatDrinkNormal;
    ImageButton infoBtn;
    boolean flag = true;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_what_id_drink, container, false);

        whatDrinkNormal = view.findViewById(R.id.whatdrinknormal_btn);
        infoBtn = view.findViewById(R.id.info_btn);


        whatDrinkNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               BeerNoBeerFragment beerNoBeerFragment = new BeerNoBeerFragment();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.replace(R.id.framelayout, beerNoBeerFragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        infoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Show information7yi", Toast.LENGTH_SHORT).show();
            }
        });

        return view;

}


   }