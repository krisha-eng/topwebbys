package com.example.android.topwebbys;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Shopping extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
    }

    public void onClicks1(View view)
    {
        Uri webpage = Uri.parse("http://www.flipkart.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClicks2(View view)
    {
        Uri webpage = Uri.parse("http://www.amazon.in/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClicks3(View view)
    {
        Uri webpage = Uri.parse("http://www.snapdeal.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClicks4(View view)
    {
        Uri webpage = Uri.parse("http://www.jabong.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClicks5(View view)
    {
        Uri webpage = Uri.parse("http://www.myntra.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClicks6(View view)
    {
        Uri webpage = Uri.parse("https://www.localbanya.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClicks7(View view)
    {
        Uri webpage = Uri.parse("http://www.homeshop18.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClicks8(View view)
    {
        Uri webpage = Uri.parse("http://www.infibeam.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClicks9(View view)
    {
        Uri webpage = Uri.parse("http://www.shopclues.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClicks10(View view)
    {
        Uri webpage = Uri.parse("http://www.firstcry.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
}
