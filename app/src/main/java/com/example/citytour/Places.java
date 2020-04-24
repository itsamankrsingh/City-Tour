package com.example.citytour;

public class Places {
    private int ImageResourceId;
    private String place_description;
    private String placeName;

    public Places(int imageResourceId,String place_name,String placeDescription){
        this.ImageResourceId=imageResourceId;
        this.place_description=placeDescription;
        this.placeName=place_name;
    }

    public int getImageResourceId() {
        return ImageResourceId;
    }

    public String getPlace_description() {
        return place_description;
    }

    public String getPlaceName(){
        return placeName;
    }
}
