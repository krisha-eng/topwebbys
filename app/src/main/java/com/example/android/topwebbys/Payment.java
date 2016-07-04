package com.example.android.topwebbys;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
    }

    public void onClickp1(View view)
    {
        Uri webpage = Uri.parse("https://www.2checkout.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickp2(View view)
    {
        Uri webpage = Uri.parse("https://stripe.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

//    public void onClickp3(View view)
//    {
//        Uri webpage = Uri.parse("https://www.2checkout.com/");
//        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
//        startActivity(webIntent);
//    }

    public void onClickp4(View view)
    {
        Uri webpage = Uri.parse("https://wepay.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickp5(View view)
    {
        Uri webpage = Uri.parse("https://www.authorize.net/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickp6(View view)
    {
        Uri webpage = Uri.parse("https://www.paypal.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickp7(View view)
    {
        Uri webpage = Uri.parse("https://payments.amazon.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
}
