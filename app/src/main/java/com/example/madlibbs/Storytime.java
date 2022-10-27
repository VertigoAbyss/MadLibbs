package com.example.madlibbs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Storytime extends AppCompatActivity {

    int num = 8;
    TextView[] thing = new TextView[num];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storytime);
        thing[0] = (TextView)findViewById(R.id.First);
        thing[1] = (TextView)findViewById(R.id.Second);
        thing[2] = (TextView)findViewById(R.id.Third);
        thing[3] = (TextView)findViewById(R.id.Fourth);
        thing[4] = (TextView)findViewById(R.id.Fifth);
        thing[5] = (TextView)findViewById(R.id.Sixth);
        thing[6] = (TextView)findViewById(R.id.Seventh);
        thing[7] = (TextView)findViewById(R.id.Eighth);
        Intent intent = getIntent();
        for(int i = 0; i < 8; i++){
            TextView dude = thing[i];
            dude.setText(intent.getStringExtra(Input_Page.EXTRA_MESSAGE[i]));
        }
    }
}