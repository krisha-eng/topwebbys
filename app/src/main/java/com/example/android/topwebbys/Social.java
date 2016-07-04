package com.example.android.topwebbys;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Social extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);
    }

    public void onClickso1(View view)
    {
        Uri webpage = Uri.parse("https://www.facebook.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickso2(View view)
    {
        Uri webpage = Uri.parse("https://www.youtube.com/?gl=IN");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickso3(View view)
    {
        Uri webpage = Uri.parse("https://twitter.com/?lang=en");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickso4(View view)
    {
        Uri webpage = Uri.parse("https://in.linkedin.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickso5(View view)
    {
        Uri webpage = Uri.parse("https://in.pinterest.com//");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickso6(View view)
    {
        Uri webpage = Uri.parse("https://plus.google.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickso7(View view)
    {
        Uri webpage = Uri.parse("https://www.tumblr.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickso8(View view)
    {
        Uri webpage = Uri.parse("https://www.instagram.com/?hl=en");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickso9(View view)
    {
        Uri webpage = Uri.parse("https://www.reddit.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
}
