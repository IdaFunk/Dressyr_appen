package com.example.ida.dressyr_appen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.example.ida.myapplication.R;

public class ProgramActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);
    }


    public void toLE1(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/LE-LD-marke/LE1_2011.html");

        startActivity(intent);
    }


    public void toLE3(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/LE-LD-marke/LE3_2011.html");

        startActivity(intent);
    }


    public void toLD1(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/LE-LD-marke/LD1_2011.html");

        startActivity(intent);
    }


    public void toLD3(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/LE-LD-marke/LD3_2011.html");

        startActivity(intent);
    }


    public void toLD4(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/LE-LD-marke/LD4_2011.html");

        startActivity(intent);
    }


    public void toLC1(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/LC-LA/LC1_2015.html");

        startActivity(intent);
    }


    public void toLC2(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/LC-LA/LC2_2015.html");

        startActivity(intent);
    }


    public void toLB1(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/LC-LA/LB1_2015.html");

        startActivity(intent);
    }


    public void toB2(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/LC-LA/LB2_2016.html");

        startActivity(intent);
    }


    public void toLB3(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/LC-LA/LB3_2007.html");

        startActivity(intent);
    }


    public void toLA1(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/LC-LA/LA1_2017.html");

        startActivity(intent);
    }


    public void toLA2(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/LC-LA/LA2_2016.html");

        startActivity(intent);
    }


    public void toLA3(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/LC-LA/LA3_2013.html");

        startActivity(intent);
    }


    public void toLA4(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/LC-LA/LA4_2015.html");

        startActivity(intent);
    }


    public void toMsvC1(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/LC-LA/MsvC1_2011.html");

        startActivity(intent);
    }


    public void toMsvC2(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/LC-LA/MsvC2_2010.html");

        startActivity(intent);
    }


    public void toMsvB1(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/MsvB-svar/MsvB1_2003.html");

        startActivity(intent);
    }


    public void toMsvB2(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/MsvB-svar/MsvB2_2006.html");

        startActivity(intent);
    }


    public void toMsvB3(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/MsvB-svar/MsvB3_2008.html");

        startActivity(intent);
    }


    public void toMsvB4(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/MsvB-svar/MsvB4_2003.html");

        startActivity(intent);
    }


    public void toMsvB5(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/MsvB-svar/MsvB5_2017.html");

        startActivity(intent);
    }


    public void toMsvA1(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/MsvB-svar/MsvA1_2016.html");

        startActivity(intent);
    }


    public void toStG(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/MsvB-svar/FEIStGeorge_2009_2017.html");

        startActivity(intent);
    }


    public void toInter1(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/MsvB-svar/FEIIntI_2009_2017.html");

        startActivity(intent);
    }


    public void toInter1B(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/MsvB-svar/Int_IB_2016.html");

        startActivity(intent);
    }


    public void toInterA(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/MsvB-svar/FEI_Int_A_2014_2015.html");

        startActivity(intent);
    }


    public void toInterB(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/MsvB-svar/Int_IB_2016.html");

        startActivity(intent);
    }


    public void toInter2(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/MsvB-svar/FEIIntII_2009_2014_2017.html");

        startActivity(intent);
    }


    public void toGP(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/MsvB-svar/FEIGP_2009_2017.html");

        startActivity(intent);
    }


    public void toGPsp(View view) {

        Intent intent = new Intent(this,ProgramWebActivity.class);
        intent.putExtra("url", "http://stallbacken.50webs.com/dressyr/program/MsvB-svar/FEIGPspec_2009_2017.html");

        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        int id = item.getItemId();

        switch (id) {
            case R.id.start:
                startActivity(new Intent(this, MainActivity.class));
                return true;
            case R.id.kontakt:
                startActivity(new Intent(this, ContactActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
