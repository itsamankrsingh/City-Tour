package com.example.citytour;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PlacesofInterest extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        ArrayList<Places> places = new ArrayList<>();

        places.add(new Places(R.drawable.ganga_dolphin, R.string.dolphin_name, R.string.dolphin));

        places.add(new Places(R.drawable.vikramshila_stupa, R.string.vikramshila_name, R.string.vikramshila));

        places.add(new Places(R.drawable.mandar_mount, R.string.mandar_name, R.string.mandar));

        places.add(new Places(R.drawable.lord_vasupujya, R.string.jain_name, R.string.jain));

        places.add(new Places(R.drawable.kuppaghat_ashram, R.string.kuppaghat_name, R.string.kuppaghat));

        places.add(new Places(R.drawable.greater_adjutant, R.string.garur_name, R.string.garur));

        places.add(new Places(R.drawable.vikramshila_setu, R.string.setu_name, R.string.setu));

        PlacesAdapter adapter = new PlacesAdapter(this, places);

        ListView listView = findViewById(R.id.places_list);
        listView.setAdapter(adapter);
    }
}
