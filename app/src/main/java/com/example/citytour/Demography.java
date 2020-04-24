package com.example.citytour;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Demography extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demography);

        TextView demo=findViewById(R.id.demography_text);
        demo.setText("As of the 2011 India census, the Bhagalpur Urban Agglomeration has a population of 410,210, " +
                "of which 218,284 were males and 191,926 were females. It is the 3rd largest city in Bihar " +
                "in terms of urban population. the total population in the age group of 0 to 6 years is 55,898. " +
                "The total number of literates are 286,125, with 160,720 males and 125,405 females." +
                " The effective literacy rate of 7+ population is 80.76%, of which while" +
                " the male literacy rate is 84.95% with women at 75.95%.");

    }
}
