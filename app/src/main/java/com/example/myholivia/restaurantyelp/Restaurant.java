package com.example.myholivia.restaurantyelp;

import android.graphics.Bitmap;

import java.util.List;

/**
 * Created by myholivia on 5/14/17.
 */

public class Restaurant {
    private String name;
    private String address;
    private String type;
    private double lat;
    private double lng;
    private Bitmap thumbnail;
    private Bitmap rating;
    private List<String> categories;
    private double stars;

    public Restaurant(){}

    /**
     * Constructor
     *
     * @param name name of the restaurant
     */
    public Restaurant(String name, String address, String type, double lat, double lng,
                      Bitmap  thumbnail, Bitmap rating) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.lat = lat;
        this.lng = lng;
        this.thumbnail = thumbnail;
        this.rating = rating;

    }

    /**
     * Getters for private attributes of Restaurant class.
     */
    public String getName() { return this.name; }
    public String getAddress() { return this.address; }
    public String getType() { return this.type; }
    public double getLat() { return lat; }
    public double getLng() { return lng; }
    public Bitmap getThumbnail() { return thumbnail; }
    public Bitmap getRating() { return rating; }
    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    public void setName(String name) {this.name = name;}
    public void setAddress(String address) {  this.address = address; }
    public void setType(String type) { this.type = type; }
    public void setLat(double lat) { this.lat = lat; }
    public void setLng(double lng) { this.lng = lng; }
    public void setThumbnail(Bitmap thumbnail) { this.thumbnail = thumbnail; }
    public void setRating(Bitmap rating) { this.rating = rating; }




}
