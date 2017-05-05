package org.institutoserpis.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Console;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "org.institutoserpis.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        //Toast.makeText(this, "Has hecho click", Toast.LENGTH_LONG).show();
        EditText editText = (EditText) findViewById(R.id.edit_message);
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra(EXTRA_MESSAGE, editText.getText().toString());
        startActivity(intent);
    }
}