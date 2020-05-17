package com.example.citytour;

public class Places {
    private int mImageResourceId;
    private int mPlaceDescriptionId;
    private int mPlaceNameId;

    public Places(int imageResourceId, int placeName, int placeDescription) {
        this.mImageResourceId = imageResourceId;
        this.mPlaceDescriptionId = placeDescription;
        this.mPlaceNameId = placeName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getPlaceDescription() {
        return mPlaceDescriptionId;
    }

    public int getPlaceName() {
        return mPlaceNameId;
    }
}
