package com.example.android.topwebbys;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Health extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);
    }

    public void onClick1(View view)
    {
        Uri webpage = Uri.parse("http://www.menshealth.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
    public void onClick2(View view)
    {
        Uri webpage = Uri.parse("http://www.mensfitness.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
    public void onClick3(View view)
    {
        Uri webpage = Uri.parse("http://www.prevention.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
    public void onClick4(View view)
    {
        Uri webpage = Uri.parse("http://www.self.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
    public void onClick5(View view)
    {
        Uri webpage = Uri.parse("http://www.fitnessmagazine.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
    public void onClick6(View view)
    {
        Uri webpage = Uri.parse("http://www.24hourfitness.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
    public void onClick7(View view)
    {
        Uri webpage = Uri.parse("http://www.ideafit.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
    public void onClick8(View view)
    {
        Uri webpage = Uri.parse("http://www.acefitness.org/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
    public void onClick9(View view)
    {
        Uri webpage = Uri.parse("http://www.goldsgym.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
    public void onClick10(View view)
    {
        Uri webpage = Uri.parse("http://www.nasm.org/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

}
