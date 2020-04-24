package com.example.citytour;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HowToReach extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.how_to_reach);

        ImageView img=findViewById(R.id.how_to_reach_image);
        img.setImageResource(R.drawable.bgp_rly);

        TextView textView=findViewById(R.id.how_to_reach_text);
        textView.setText("Bhagalpur is well connected with other part of country by roads and trains.\n" +
                "\n" +
                "Railways: The Bhagalpur Junction railway station, is connected to most of the major cities in India by the railway network, which lies in between Howrah Kiul loop-line which serves Bhagalpur with numerous number of trains. It is the 3rd busiest line in Bihar. About 100 pairs of Express and 40 pairs of passenger train pass through this line. Bhagalpur is A1 grade Railway station.It is the highest revenue generator in the Malda Rail Division. It is the third major railway station in Eastern Railway after Howrah and Sealdah. Bhagalpur is well connected to Delhi, Mumbai, Kolkata, Bangalore, Ajmer, Kanpur, Patna, Guwahati, Surat, Jammu Tawi, Munger, Gaya and other cities.North Bhagalpur is served by the Barauni- Katihar section of the ECR/NFR. Narainpur, Thana Bihpur, Naugachhia and Katareah railway stations lie on this line.\n" +
                "\n");

    }
}
