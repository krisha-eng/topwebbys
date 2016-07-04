package com.example.android.topwebbys;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Gaming extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaming);
    }


    public void onClickg1(View view)
    {
        Uri webpage = Uri.parse("http://www.y8.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }


    public void onClickg2(View view)
    {
        Uri webpage = Uri.parse("http://www.pogo.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }


    public void onClickg3(View view)
    {
        Uri webpage = Uri.parse("http://www.miniclip.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }


    public void onClickg4(View view)
    {
        Uri webpage = Uri.parse("http://www.bigfishgames.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickg5(View view)
    {
        Uri webpage = Uri.parse("http://www.zyngagames.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickg6(View view)
    {
        Uri webpage = Uri.parse("http://www.addictinggames.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
}
