package org.institutoserpis.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import static android.R.id.message;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE));
        layout.addView(textView);
    }
}