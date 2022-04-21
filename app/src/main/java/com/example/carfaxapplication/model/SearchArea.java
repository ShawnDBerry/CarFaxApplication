
package com.example.carfaxapplication.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchArea {

    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("zip")
    @Expose
    private String zip;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("radius")
    @Expose
    private Double radius;
    @SerializedName("dynamicRadius")
    @Expose
    private Boolean dynamicRadius;
    @SerializedName("dynamicRadii")
    @Expose
    private List<Double> dynamicRadii = null;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Boolean getDynamicRadius() {
        return dynamicRadius;
    }

    public void setDynamicRadius(Boolean dynamicRadius) {
        this.dynamicRadius = dynamicRadius;
    }

    public List<Double> getDynamicRadii() {
        return dynamicRadii;
    }

    public void setDynamicRadii(List<Double> dynamicRadii) {
        this.dynamicRadii = dynamicRadii;
    }

}
