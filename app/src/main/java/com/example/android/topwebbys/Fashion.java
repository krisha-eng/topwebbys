package com.example.android.topwebbys;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Fashion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fashion);
    }

    public void onClickf1(View view)
    {
        Uri webpage = Uri.parse("http://www.fashionnews.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickf2(View view)
    {
        Uri webpage = Uri.parse("http://news.yahoo.com/fashion/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickf3(View view)
    {
        Uri webpage = Uri.parse("http://www.vogue.co.uk");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickf4(View view)
    {
        Uri webpage = Uri.parse("http://fashiongear.fibre2fashion/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickf5(View view)
    {
        Uri webpage = Uri.parse("http://www.nytimes.com/pages/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickf6(View view)
    {
        Uri webpage = Uri.parse("http://www.style.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickf7(View view)
    {
        Uri webpage = Uri.parse("http://fashion.telegraph.co.uk/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
}
