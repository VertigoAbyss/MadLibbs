package com.example.madlibbs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Input_Page extends AppCompatActivity {

    public static final String[] EXTRA_MESSAGE = {
            "com.example.MadLibsExample.WORD1",
            "com.example.MadLibsExample.WORD2",
            "com.example.MadLibsExample.WORD3",
            "com.example.MadLibsExample.WORD4",
            "com.example.MadLibsExample.WORD5",
            "com.example.MadLibsExample.WORD6",
            "com.example.MadLibsExample.WORD7",
            "com.example.MadLibsExample.WORD8"
    };

    String[] wordList = {
            "Occupation",
            "Professor Name",
            "Object (plural)",
            "Strong Emotion",
            "Object (singular)",
            "Ridiculous Name",
            "Object (plural)",
            "Different Occupation"
    };

    EditText hintinputs1;
    EditText hintinputs2;
    EditText hintinputs3;
    EditText hintinputs4;
    EditText hintinputs5;
    EditText hintinputs6;
    EditText hintinputs7;
    EditText hintinputs8;

    String currentvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_page);
        setarray();
    }

    public void sendMessage(View view) {
        Log.e(String.valueOf(AllEntriesCheck()), String.valueOf(AllEntriesCheck()));
        if(AllEntriesCheck()) {
            Intent intent = new Intent(this, Storytime.class);
            sendExtras(intent);
            startActivity(intent);
        }
    }


    private void setarray(){
        hintinputs1 = findViewById(R.id.textViewInLists);
        Log.e("Did This Fire?", "Did IT?");
        hintinputs2 = (EditText)findViewById(R.id.textViewInLists2);
        hintinputs3 = (EditText)findViewById(R.id.textViewInLists3);
        hintinputs4 = (EditText)findViewById(R.id.textViewInLists4);
        hintinputs5 = (EditText)findViewById(R.id.textViewInLists5);
        hintinputs6 = (EditText)findViewById(R.id.textViewInLists6);
        hintinputs7 = (EditText)findViewById(R.id.textViewInLists7);
        hintinputs8 = (EditText)findViewById(R.id.textViewInLists8);
        currentvalue = hintinputs1.getText().toString();
    }
    private boolean AllEntriesCheck()
    {
        if (hintinputs1.getText().toString().equals(currentvalue) ||
                hintinputs2.getText().toString().equals(currentvalue) ||
                hintinputs3.getText().toString().equals(currentvalue) ||
                hintinputs4.getText().toString().equals(currentvalue) ||
                hintinputs5.getText().toString().equals(currentvalue) ||
                hintinputs6.getText().toString().equals(currentvalue) ||
                hintinputs7.getText().toString().equals(currentvalue) ||
                hintinputs8.getText().toString().equals(currentvalue)) {
            Toast.makeText(this, "Please put terms in all blanks!", Toast.LENGTH_LONG).show();
            return false;
        }
        Log.e(hintinputs2.getText().toString(), hintinputs2.getText().toString());
        return true;
    }

    void sendExtras(Intent intent)
    {
        intent.putExtra(EXTRA_MESSAGE[0], hintinputs1.getText().toString());
        intent.putExtra(EXTRA_MESSAGE[1], hintinputs2.getText().toString());
        intent.putExtra(EXTRA_MESSAGE[2], hintinputs3.getText().toString());
        intent.putExtra(EXTRA_MESSAGE[3], hintinputs4.getText().toString());
        intent.putExtra(EXTRA_MESSAGE[4], hintinputs5.getText().toString());
        intent.putExtra(EXTRA_MESSAGE[5], hintinputs6.getText().toString());
        intent.putExtra(EXTRA_MESSAGE[6], hintinputs7.getText().toString());
        intent.putExtra(EXTRA_MESSAGE[7], hintinputs8.getText().toString());
    }
}