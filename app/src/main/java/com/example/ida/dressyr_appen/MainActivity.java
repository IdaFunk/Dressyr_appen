package com.example.ida.dressyr_appen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.example.ida.myapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void toExer(View view) {

        startActivity(new Intent(this, ExercisesActivity.class));
    }


    public void toProgr(View view) {

        startActivity(new Intent(this, ProgramActivity.class));
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
