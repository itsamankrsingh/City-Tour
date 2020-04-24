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

        ImageView img=findViewById(R.id.how_to_reach_image);
        img.setImageResource(R.drawable.great_buddha_statue);

        TextView textView=findViewById(R.id.how_to_reach_text);
        textView.setText("Bihar (/bɪˈhɑːr/; Hindi pronunciation: [bɪˈɦaːr] (About this soundlisten)) is a state in eastern India. " +
                "It is the third-largest state by population and twelfth-largest by territory, with an area of 94,163 km2 (36,357 sq mi). " +
                "It is contiguous with Uttar Pradesh to its west, Nepal to the north, the northern part of " +
                "West Bengal to the east, and with Jharkhand to the south. The Bihar plain is split by the river Ganges, " +
                "which flows from west to east.[12] Three main cultural regions converge in the state: Magadh, Mithila, and Bhojpur. "+
                "In ancient and classical India, the area that is now Bihar was considered a centre of power" +
                ", learning, and culture.[17] From Magadha arose India's first empire, the Maurya empire, as well as one of" +
                " the world's most widely adhered-to religions: Buddhism.Magadha empires, notably under the Maurya" +
                " and Gupta dynasties, unified large parts of South Asia under a central rule.Another region of Bihar is Mithila " +
                "which was an early centre of learning and the centre of the Videha kingdom.");
    }
}
