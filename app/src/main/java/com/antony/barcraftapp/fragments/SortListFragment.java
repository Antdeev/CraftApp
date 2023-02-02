package com.antony.barcraftapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.antony.barcraftapp.R;
import com.antony.barcraftapp.res.AdapterLogo;
import com.antony.barcraftapp.res.ListMenuLogo;

import java.util.ArrayList;


public class SortListFragment extends Fragment {


    GridView detailSort;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_sort_list, null);

       detailSort = view.findViewById(R.id.listMenuBeer);

        ArrayList<ListMenuLogo> logoArrays = new ArrayList<ListMenuLogo>();
        logoArrays.add(new ListMenuLogo("4BREWES", R.drawable.logo4brewes));
        logoArrays.add(new ListMenuLogo("Бакунин", R.drawable.logobakunin));
        logoArrays.add(new ListMenuLogo("Бакунин", R.drawable.logobrewloc1));
        logoArrays.add(new ListMenuLogo("Big Village", R.drawable.logobigvillage));
        logoArrays.add(new ListMenuLogo("Salden's", R.drawable.logosaldens));
        logoArrays.add(new ListMenuLogo("Sabotage", R.drawable.logosabotage));
        logoArrays.add(new ListMenuLogo("Hop Head", R.drawable.logohophead));
        logoArrays.add(new ListMenuLogo("Zagovor", R.drawable.logozagovor));

        AdapterLogo stateAdapter = new AdapterLogo(getContext(), R.layout.list_menu_sort, logoArrays);
        detailSort.setAdapter(stateAdapter);


        return  view;
    }
}