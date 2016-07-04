package com.example.android.topwebbys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void onClickSubmit(View view)
    {
        EditText View1=(EditText) findViewById(R.id.text);
        if(View1.isEnabled())
        {
            Toast.makeText(this, "Thank you for Rating us!", Toast.LENGTH_LONG).show();
        }
        else
        {
            return;
        }
    }
}
