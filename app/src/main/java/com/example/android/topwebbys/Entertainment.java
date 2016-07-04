package com.example.android.topwebbys;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Entertainment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment);
    }

    public void onClickEonline(View view)
    {
        Uri webpage = Uri.parse("http://www.eonline.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickIMDB(View view)
    {
        Uri webpage = Uri.parse("http://www.imdb.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickNetflix(View view)
    {
        Uri webpage = Uri.parse("https://www.netflix.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickSeriesbunch(View view)
    {
        Uri webpage = Uri.parse("http://www.seriesbunch.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickAdder(View view)
    {
        Uri webpage = Uri.parse("http://www.adder.tv/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickPogo(View view)
    {
        Uri webpage = Uri.parse("http://www.pogo.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickRoll(View view)
    {
        Uri webpage = Uri.parse("http://www.rollingstone.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickSpotify(View view)
    {
        Uri webpage = Uri.parse("https://www.spotify.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickNine(View view)
    {
        Uri webpage = Uri.parse("http://www.9gag.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickFan(View view)
    {
        Uri webpage = Uri.parse("http://www.fandango.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
}
