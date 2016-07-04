package com.example.android.topwebbys;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_md);
    }

    public void onClickm1(View view)
    {
        Uri webpage = Uri.parse("http://www.shaadi.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickm2(View view)
    {
        Uri webpage = Uri.parse("http://www.jeevansathi.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickm3(View view)
    {
        Uri webpage = Uri.parse("http://www.simplymarry.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickm4(View view)
    {
        Uri webpage = Uri.parse("http://www.telugumatrimony.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickm5(View view)
    {
        Uri webpage = Uri.parse("http://www.keralamatrimony.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickm6(View view)
    {
        Uri webpage = Uri.parse("http://www.m4marry.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickm7(View view)
    {
        Uri webpage = Uri.parse("http://www.tamilmatrimony.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickm8(View view)
    {
        Uri webpage = Uri.parse("http://www.hindimatrimony.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickm9(View view)
    {
        Uri webpage = Uri.parse("http://profile.bengalimatrimony.com/login/login.php/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickm10(View view)
    {
        Uri webpage = Uri.parse("http://www.marathimatrimony.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
}
