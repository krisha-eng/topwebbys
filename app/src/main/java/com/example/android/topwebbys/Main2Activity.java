package com.example.android.topwebbys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast.makeText(this, "Click on the Category Names to access them!", Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.aboutus:
                Intent intent = new Intent(this, Main3Activity.class);
                startActivity(intent);
                break;
        }
        return true;
    }


    public void onClickAstrology(View view)
    {
        Intent intent = new Intent(this, Astrology.class);
        startActivity(intent);
    }

    public void onClickBlogging(View view)
    {
        Intent intent = new Intent(this, Blogging.class);
        startActivity(intent);
    }

    public void onClickBooks(View view)
    {
        Intent intent = new Intent(this, Books.class);
        startActivity(intent);
    }

    public void onClickCooking(View view)
    {
        Intent intent = new Intent(this, Cooking.class);
        startActivity(intent);
    }

    public void onClickDIY(View view)
    {
        Intent intent = new Intent(this, DIY.class);
        startActivity(intent);
    }

    public void onClickEdu(View view)
    {
        Intent intent = new Intent(this, Educational.class);
        startActivity(intent);
    }

    public void onClickEntertainment(View view)
    {
        Intent intent = new Intent(this, Entertainment.class);
        startActivity(intent);
    }

    public void onClickFashion(View view)
    {
        Intent intent = new Intent(this, Fashion.class);
        startActivity(intent);
    }

    public void onClickGaming(View view)
    {
        Intent intent = new Intent(this, Gaming.class);
        startActivity(intent);
    }

    public void onClickHealth(View view)
    {
        Intent intent = new Intent(this,Health.class);
        startActivity(intent);
    }

    public void onClickImgShare(View view)
    {
        Intent intent = new Intent(this, Imageshare.class);
        startActivity(intent);
    }

    public void onClickJobs(View view)
    {
        Intent intent = new Intent(this,Jobs.class);
        startActivity(intent);
    }

    public void onClickKnow(View view)
    {
        Intent intent = new Intent(this, Knowledge.class);
        startActivity(intent);
    }

    public void onClickMD(View view)
    {
        Intent intent = new Intent(this, MD.class);
        startActivity(intent);
    }


    public void onClickShopping(View view)
    {
        Intent intent = new Intent(this, Shopping.class);
        startActivity(intent);
    }

    public void onClickPay(View view)
    {
        Intent intent = new Intent(this, Payment.class);
        startActivity(intent);
    }

    public void onClickSocial(View view)
    {
        Intent intent = new Intent(this, Social.class);
        startActivity(intent);
    }

    public void onClickTours(View view)
    {
        Intent intent = new Intent(this, Tours.class);
        startActivity(intent);
    }

}
