package com.example.citytour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t = (TextView) findViewById(R.id.text);

        t.setText(R.string.about_bhagalpur);

        ImageView img = findViewById(R.id.image);
        img.setImageResource(R.drawable.bhagalpur_tourist_map);

        Button general_info = findViewById(R.id.general_ifo_button);
        general_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent generalIntent = new Intent(MainActivity.this, GenerlInformation.class);
                startActivity(generalIntent);
            }
        });

        Button demography = findViewById(R.id.demography_button);
        demography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent demoIntent = new Intent(MainActivity.this, Demography.class);
                startActivity(demoIntent);
            }
        });

        Button placesOfInterest = findViewById(R.id.tourist_button);
        placesOfInterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent touristIntent = new Intent(MainActivity.this, PlacesofInterest.class);
                startActivity(touristIntent);
            }
        });

        Button howToReach = findViewById(R.id.reach_button);
        howToReach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reachIntent = new Intent(MainActivity.this, HowToReach.class);
                startActivity(reachIntent);
            }
        });

        Button aboutBihar = findViewById(R.id.about_bihar_button);
        aboutBihar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent biharIntent = new Intent(MainActivity.this, AboutBihar.class);
                startActivity(biharIntent);
            }
        });
    }
}
