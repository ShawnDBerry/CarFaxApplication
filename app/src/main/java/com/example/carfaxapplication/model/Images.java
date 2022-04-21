
package com.example.carfaxapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Images {

    @SerializedName("baseUrl")
    @Expose
    private String baseUrl;
    @SerializedName("large")
    @Expose
    private List<String> large = null;
    @SerializedName("medium")
    @Expose
    private List<String> medium = null;
    @SerializedName("small")
    @Expose
    private List<String> small = null;
    @SerializedName("firstPhoto")
    @Expose
    private FirstPhoto firstPhoto;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public List<String> getLarge() {
        return large;
    }

    public void setLarge(List<String> large) {
        this.large = large;
    }

    public List<String> getMedium() {
        return medium;
    }

    public void setMedium(List<String> medium) {
        this.medium = medium;
    }

    public List<String> getSmall() {
        return small;
    }

    public void setSmall(List<String> small) {
        this.small = small;
    }

    public FirstPhoto getFirstPhoto() {
        return firstPhoto;
    }

    public void setFirstPhoto(FirstPhoto firstPhoto) {
        this.firstPhoto = firstPhoto;
    }

}
