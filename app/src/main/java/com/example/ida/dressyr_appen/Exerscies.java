package com.example.ida.dressyr_appen;

import android.provider.BaseColumns;

import com.example.ida.myapplication.R;


public class Exerscies implements BaseColumns {

    public static final int[] IMAGE_IDS = new int[] {
            R.drawable.volter,
            R.drawable.attan,
            R.drawable.paronhalvor,
            R.drawable.timglas,
            R.drawable.voltmtvablobbar
    };

    public static final String[] HEAD_IDS = new String[]{
            "4 Volter",
            "8:an",
            "Päronhalvor",
            "Timglaset",
            "Volt med blobbar"
    };

    public static final int[] EXERCISE_IDS = new int[]{
            R.string.volter,
            R.string.attan,
            R.string.paronhalvor,
            R.string.timglas,
            R.string.voltermtvablobbar
    };


    private String head;
    private int img;
    private String exerice;

    public Exerscies(String head, int img, String text) {
        this.head = head;
        this.img = img;
        this.exerice = text;
    }



    public int getImg() {

        return img;
    }

    public String getExerice() {

        return exerice;
    }


    public String getHead() {

        return head;
    }

    @Override
    public String toString(){

        return getImg() + "\n" + getExerice();
    }


}
