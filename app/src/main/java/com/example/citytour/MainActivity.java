package com.example.citytour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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


    }
}
