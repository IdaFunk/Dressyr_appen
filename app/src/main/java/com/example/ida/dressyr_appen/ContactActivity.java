package com.example.ida.dressyr_appen;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ida.myapplication.R;

public class ContactActivity extends AppCompatActivity {

    private EditText mail;
    private EditText namn;
    private EditText subject;
    private EditText message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        namn = (EditText) findViewById(R.id.name);
        mail = (EditText) findViewById(R.id.mail);
        subject = (EditText)findViewById(R.id.subject);
        message = (EditText)findViewById(R.id.message);

    }

    public void sendMessage(View view) {

        String subject = this.subject.getEditableText().toString();
        String userMessage = message.getEditableText().toString();

        if (subject.isEmpty() || userMessage.isEmpty()) {
            Toast.makeText(this, "Invalid data", Toast.LENGTH_SHORT).show();
            return;
        }

        String body=
                    "<br>From Name: " + namn.getText().toString()+
                    "<br>Email: " + mail.getText().toString();


        Uri uri = Uri.parse("mailto:" + "ida.funk@hotmail.com");

        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);

        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, userMessage + body);

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
