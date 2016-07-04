package com.example.android.topwebbys;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Educational extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educational);
    }

    public void onClickAcad(View view)
    {
        Uri webpage = Uri.parse("http://www.academicearth.org/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickBig(View view)
    {
        Uri webpage = Uri.parse("http://www.bigthink.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickBright(View view)
    {
        Uri webpage = Uri.parse("http://www.brightstorm.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickCosmo(View view)
    {
        Uri webpage = Uri.parse("http://www.cosmolearning.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickCoursera(View view)
    {
        Uri webpage = Uri.parse("http://www.coursera.org/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickEdx(View view)
    {
        Uri webpage = Uri.parse("http://www.edx.org/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickFutures(View view)
    {
        Uri webpage = Uri.parse("http://www.thefutureschannel.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickHowcast(View view)
    {
        Uri webpage = Uri.parse("http://www.howcast.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickInternet(View view)
    {
        Uri webpage = Uri.parse("http://www.archive.org/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickItunes(View view)
    {
        Uri webpage = Uri.parse("http://www.open.edu/itunes/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickKhan(View view)
    {
        Uri webpage = Uri.parse("http://www.khanacademy.org/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickMath(View view)
    {
        Uri webpage = Uri.parse("http://www.mathtv.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickMITopen(View view)
    {
        Uri webpage = Uri.parse("http://ocw.mit.edu/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickNeok(View view)
    {
        Uri webpage = Uri.parse("http://www.neok12.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickResearch(View view)
    {
        Uri webpage = Uri.parse("http://www.youtube.com/user/ResearchChannel/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickPBS(View view)
    {
        Uri webpage = Uri.parse("http://video.pbs.org/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickSchoolTube(View view)
    {
        Uri webpage = Uri.parse("http://www.schooltube.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickSchool(View view)
    {
        Uri webpage = Uri.parse("http://www.schoolsworld.tv/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickSnag(View view)
    {
        Uri webpage = Uri.parse("http://www.snagfilms.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickTeacher(View view)
    {
        Uri webpage = Uri.parse("http://www.teachertube.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickTED(View view)
    {
        Uri webpage = Uri.parse("http://www.ted.org/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickVideojug(View view)
    {
        Uri webpage = Uri.parse("http://www.videojug.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickWatch(View view)
    {
        Uri webpage = Uri.parse("http://www.watchknowlearn.org/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickWonder(View view)
    {
        Uri webpage = Uri.parse("http://www.wonderhowto.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickOpen(View view)
    {
        Uri webpage = Uri.parse("http://oyc.yale.edu/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickYou(View view)
    {
        Uri webpage = Uri.parse("http://www.youtube.com/edu/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickBrain(View view)
    {
        Uri webpage = Uri.parse("http://www.brainpop.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickCosmeo(View view)
    {
        Uri webpage = Uri.parse("http://www.cosmeo.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickHulu(View view)
    {
        Uri webpage = Uri.parse("http://www.hulu.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickMeta(View view)
    {
        Uri webpage = Uri.parse("http://www.metacafe.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void onClickVimeo(View view)
    {
        Uri webpage = Uri.parse("http://www.vimeo.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

}
