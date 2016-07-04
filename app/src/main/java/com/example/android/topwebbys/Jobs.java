package com.example.android.topwebbys;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Jobs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs);
    }

    public void onClickj1(View view)
    {
        Uri webpage = Uri.parse("http://www.careerbuilder.co.in/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickj2(View view)
    {
        Uri webpage = Uri.parse("http://www.indeed.co.in/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickj3(View view)
    {
        Uri webpage = Uri.parse("http://www.jobs.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickj4(View view)
    {
        Uri webpage = Uri.parse("https://www.theladders.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickj5(View view)
    {
        Uri webpage = Uri.parse("https://www.roberthalf.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickj6(View view)
    {
        Uri webpage = Uri.parse("https://in.linkedin.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickj7(View view)
    {
        Uri webpage = Uri.parse("https://www.glassdoor.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickj8(View view)
    {
        Uri webpage = Uri.parse("http://www.monsterindia.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickj9(View view)
    {
        Uri webpage = Uri.parse("http://www.simplyhired.co.in/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }


}
