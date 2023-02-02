package com.antony.barcraftapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.antony.barcraftapp.R;


public class BeerNoBeerFragment extends Fragment {

    ImageButton buttonBeer;
    ImageButton buttonNoBeer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_beer_no_beer, container, false);

//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                switch (v.getId()){
//                    case R.id.beer_btn:
//                        Toast.makeText(getContext(), "Start BEER menu", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.no_beer_btn:
//                        Toast.makeText(getContext(), "Start NO BEER menu", Toast.LENGTH_SHORT).show();
//                }
//
//            }
//
//        });
        buttonBeer = view.findViewById(R.id.beer_btn);

        buttonBeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MenuLogoBeerFragment menuLogoBeerFragment = new MenuLogoBeerFragment();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.replace(R.id.framelayout, menuLogoBeerFragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });




        return view;
    }
}