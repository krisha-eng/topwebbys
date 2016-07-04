package com.example.android.topwebbys;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DIY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diy);
    }

    public void onClickIns(View view)
    {
        Uri webpage = Uri.parse("http://www.instructables.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickDIY(View view)
    {
        Uri webpage = Uri.parse("http://www.doityourself.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickMake(View view)
    {
        Uri webpage = Uri.parse("http://www.makezine.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickGreen(View view)
    {
        Uri webpage = Uri.parse("http://www.greenupgrader.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickDIYNET(View view)
    {
        Uri webpage = Uri.parse("http://www.diynetwork.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickCraftster(View view)
    {
        Uri webpage = Uri.parse("http://www.craftster.org/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickEhow(View view)
    {
        Uri webpage = Uri.parse("http://www.ehow.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
}
