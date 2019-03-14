package com.example.acer.admodsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        MobileAds.initialize (this,"ca-app-pub-3940256099942544~3347511713");
        adView=findViewById (R.id.add);
        AdRequest adRequest=new AdRequest.Builder ().build ();
        adView.loadAd (adRequest);
    }
}
