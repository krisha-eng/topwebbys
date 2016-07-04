package com.example.android.topwebbys;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Imageshare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageshare);
    }

    public void onClicki1(View view)
    {
        Uri webpage = Uri.parse("https://www.instagram.com/?hl=en");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
    public void onClicki2(View view)
    {
        Uri webpage = Uri.parse("http://www.imgur.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
    public void onClicki3(View view)
    {
        Uri webpage = Uri.parse("https://www.flickr.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
    public void onClicki4(View view)
    {
        Uri webpage = Uri.parse("http://s5.photobucket.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
    public void onClicki5(View view)
    {
        Uri webpage = Uri.parse("https://in.pinterest.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
    public void onClicki6(View view)
    {
        Uri webpage = Uri.parse("https://www.shutterfly.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
    public void onClicki7(View view)
    {
        Uri webpage = Uri.parse("http://www.tinypic.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
    public void onClicki8(View view)
    {
        Uri webpage = Uri.parse("https://www.500px.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
    public void onClicki9(View view)
    {
        Uri webpage = Uri.parse("https://www.imageshack.us/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
    public void onClicki10(View view)
    {
        Uri webpage = Uri.parse("http://www.imagevenue.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }


}
