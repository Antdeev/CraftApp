package com.antony.barcraftapp.res;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.antony.barcraftapp.R;
import com.antony.barcraftapp.fragments.MenuLogoBeerFragment;

import java.util.ArrayList;
import java.util.List;

public class AdapterLogo extends ArrayAdapter<ListMenuLogo> {

    private LayoutInflater inflater;
    private int layout;
    private List<ListMenuLogo> logoArrays;

    public AdapterLogo(Context context, int resource, ArrayList<ListMenuLogo> logoArrays) {
       super(context , resource , logoArrays);
        this.logoArrays = logoArrays;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View view=inflater.inflate(this.layout, parent, false);

        ImageView flagView = view.findViewById(R.id.flag);
        TextView nameViewBeer = view.findViewById(R.id.name1);
        ListMenuLogo arr = logoArrays.get(position);
        flagView.setImageResource(arr.getFlagResource());
        nameViewBeer.setText(arr.getName());

        return view;
    }


}
