package com.example.ida.dressyr_appen;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ida.myapplication.R;

public class ExercisesActivity extends AppCompatActivity {

    private TextView text;
    private TextView head;
    private ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);

        text = (TextView) findViewById(R.id.text);
        image = (ImageView) findViewById(R.id.img);
        head = (TextView) findViewById(R.id.head);

        //För att skriva ut rubrik, bild och text med samma index = samma sort = sammanhängande.
        int index = Utils.RNG.nextInt(Exerscies.HEAD_IDS.length);

        head.setText(Exerscies.HEAD_IDS[index]);
        image.setImageResource(Exerscies.IMAGE_IDS[index]);
        text.setText(Exerscies.EXERCISE_IDS[index]);
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

