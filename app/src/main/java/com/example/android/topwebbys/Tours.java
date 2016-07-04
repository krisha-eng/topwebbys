package com.example.android.topwebbys;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tours extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tours);
    }

    public void onClickt1(View view)
    {
        Uri webpage = Uri.parse("https://www.makemytrip.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickt2(View view)
    {
        Uri webpage = Uri.parse("http://www.thomascook.in/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickt3(View view)
    {
        Uri webpage = Uri.parse("http://www.coxandkings.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickt4(View view)
    {
        Uri webpage = Uri.parse("http://www.yatra.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickt5(View view)
    {
        Uri webpage = Uri.parse("http://www.sotc.in/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickt6(View view)
    {
        Uri webpage = Uri.parse("https://www.goibibo.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickt7(View view)
    {
        Uri webpage = Uri.parse("http://www.expedia.co.in/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickt8(View view)
    {
        Uri webpage = Uri.parse("http://www.cleartrip.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
}
