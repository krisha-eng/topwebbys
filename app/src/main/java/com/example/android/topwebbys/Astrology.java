package com.example.android.topwebbys;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Astrology extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_astrology);
    }

public void onClickHoroscope(View view)
{
    Uri webpage = Uri.parse("http://www.horoscope.com/us/index.aspx");
    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
    startActivity(webIntent);
}
    public void onClickAstro(View view)
    {
        Uri webpage = Uri.parse("https://www.astro.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickAstrology(View view)
    {
        Uri webpage = Uri.parse("http://www.astrology.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickGanesha(View view)
    {
        Uri webpage = Uri.parse("http://www.ganeshaspeaks.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickKRS(View view)
    {
        Uri webpage = Uri.parse("http://www.astrologykrs.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickVedic(View view)
    {
        Uri webpage = Uri.parse("http://www.lightonvedicastrology.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickNikhil(View view)
    {
        Uri webpage = Uri.parse("http://www.nikhilworld.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickSap(View view)
    {
        Uri webpage = Uri.parse("http://www.saptarishisastrology.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
}
