package com.antony.barcraftapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Toast;

import com.antony.barcraftapp.R;
import com.antony.barcraftapp.res.AdapterLogo;
import com.antony.barcraftapp.res.ListMenuLogo;

import java.util.ArrayList;


public class MenuLogoBeerFragment extends Fragment {

    GridView listLogoBeer;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_menu_logo_beer, null);
        listLogoBeer = view.findViewById(R.id.listMenuBeer);

        ArrayList<ListMenuLogo> logoArrays = new ArrayList<ListMenuLogo>();
       logoArrays.add(new ListMenuLogo("4BREWES", R.drawable.logo4brewes));
        logoArrays.add(new ListMenuLogo("Бакунин", R.drawable.logobakunin));
        logoArrays.add(new ListMenuLogo("Бакунин", R.drawable.logobrewloc1));
        logoArrays.add(new ListMenuLogo("Big Village", R.drawable.logobigvillage));
        logoArrays.add(new ListMenuLogo("Salden's", R.drawable.logosaldens));
        logoArrays.add(new ListMenuLogo("Sabotage", R.drawable.logosabotage));
        logoArrays.add(new ListMenuLogo("Hop Head", R.drawable.logohophead));
        logoArrays.add(new ListMenuLogo("Zagovor for GIT))", R.drawable.logozagovor));


        AdapterLogo stateAdapter = new AdapterLogo(getContext(), R.layout.list_menu_logo, logoArrays);


//        ArrayAdapter<ListMenuLogo> adapter = new ArrayAdapter<ListMenuLogo>(
//               getContext(), R.layout.fragment_menu_logo_beer, logoArrays);

       listLogoBeer.setAdapter(stateAdapter);

       listLogoBeer.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position == 4 ){
                   SortListFragment  descriptionFragment = new SortListFragment();
                   FragmentTransaction ft = getFragmentManager().beginTransaction();
                   ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                   ft.replace(R.id.framelayout, descriptionFragment);
                   ft.addToBackStack(null);
                   ft.commit();
               }
           }
       });




        return view;
    }
}