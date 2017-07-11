package com.nearur.allnews;



/**
 * Created by mrdis on 7/11/2017.
 */

public class Country {
    int ic;
    String name;


    public Country(){

    }

    public Country(int ic, String name) {
        this.ic = ic;
        this.name = name;
    }

    public int getIc() {
        return ic;
    }

    public void setIc(int ic) {
        this.ic = ic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
