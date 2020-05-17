package com.example.citytour;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AboutBihar extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.how_to_reach);


        ImageView img = findViewById(R.id.how_to_reach_image);
        img.setImageResource(R.drawable.great_buddha_statue);

        TextView textView = findViewById(R.id.how_to_reach_text);
        textView.setText(R.string.about_bihar);
    }
}
