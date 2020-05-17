package com.example.citytour;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class PlacesAdapter extends ArrayAdapter<Places> {
    public PlacesAdapter(Context context, ArrayList<Places> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.places_of_interest, parent, false);
        }

        Places currentPlace = getItem(position);


        ImageView placeImage = listItemView.findViewById(R.id.touristImage);
        placeImage.setImageResource(currentPlace.getImageResourceId());

        TextView placeNameText = listItemView.findViewById(R.id.placeName);
        placeNameText.setText(currentPlace.getPlaceName());

        TextView placeText = listItemView.findViewById(R.id.touristText);
        placeText.setText(currentPlace.getPlaceDescription());

        return listItemView;
    }
}
