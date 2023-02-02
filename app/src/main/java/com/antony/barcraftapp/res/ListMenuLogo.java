package com.antony.barcraftapp.res;

import android.content.Context;

import java.util.ArrayList;

public class ListMenuLogo {

    private String name; // название

    private int flagResource; // картинка

    private String description;

    public ListMenuLogo(String name,int flag){


        this.flagResource=flag;
        this.name = name;
    }


    public ListMenuLogo(String name, String description, int flag){ //TODO must verify how work it


        this.flagResource=flag;
        this.description = description;
        this.name = name;
    }





    public ListMenuLogo(Context context, int resource, ArrayList<ListMenuLogo> logoArrays) {
    }

    public String  getName(){
        return this.name;
    }

    public void  setName(String name){
        this.name = name;
    }



    public String  getDescription(){
        return this.description;
    }




    public int getFlagResource() {
        return this.flagResource;
    }

    public void setFlagResource(int flagResource) {
        this.flagResource = flagResource;
    }

}
