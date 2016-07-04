package com.example.android.topwebbys;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Knowledge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowledge);
    }

    public void onClickk1(View view)
    {
        Uri webpage = Uri.parse("https://www.ted.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickk2(View view)
    {
        Uri webpage = Uri.parse("http://www.answerbag.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickk3(View view)
    {
        Uri webpage = Uri.parse("http://www.howstuffworks.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickk4(View view)
    {
        Uri webpage = Uri.parse("https://www.khanacademy.org/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickk5(View view)
    {
        Uri webpage = Uri.parse("https://www.gutenberg.org/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickk6(View view)
    {
        Uri webpage = Uri.parse("https://www.brainpickings.org/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
}
