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

        TextView t=(TextView)findViewById(R.id.text);

       t.setText("Bhagalpur is a city of historical importance on the southern banks of the river Ganges in " +
                "the Indian state of Bihar." +
                "It is the 3rd largest city of Bihar and also the headquarters of Bhagalpur district and Bhagalpur division. " +
                "Known as Silk City, it is a major educational, commercial, and political centre, " +
                "and listed for development under the Smart City program, a joint venture between Government and industry. " +
                "The Gangetic plains surrounding the city are very fertile and the main crops include" +
                " rice, wheat, maize, barley, and oilseeds. " +
                "The river is home to the Gangetic dolphin, the National Aquatic Animal of India," +
                " and the Vikramshila Gangetic Dolphin Sanctuary is established near the town.");

        ImageView img=(ImageView)findViewById(R.id.image);
        img.setImageResource(R.drawable.bhagalpur_tourist_map);

        Button general_info=findViewById(R.id.general_ifo_button);
        general_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent generalIntent=new Intent(MainActivity.this,GenerlInformation.class);
                startActivity(generalIntent);
            }
        });

        Button demography=findViewById(R.id.demography_button);
        demography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent demoIntent=new Intent(MainActivity.this,Demography.class);
                startActivity(demoIntent);
            }
        });

        Button placesOfInterest=findViewById(R.id.tourist_button);
        placesOfInterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent touristIntent=new Intent(MainActivity.this,PlacesofInterest.class);
                startActivity(touristIntent);
            }
        });
    }
}
