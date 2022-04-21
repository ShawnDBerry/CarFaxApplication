
package com.example.carfaxapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Dealer {

    @SerializedName("carfaxId")
    @Expose
    private String carfaxId;
    @SerializedName("dealerInventoryUrl")
    @Expose
    private String dealerInventoryUrl;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("zip")
    @Expose
    private String zip;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("dealerAverageRating")
    @Expose
    private Double dealerAverageRating;
    @SerializedName("dealerReviewDate")
    @Expose
    private String dealerReviewDate;
    @SerializedName("dealerReviewReviewer")
    @Expose
    private String dealerReviewReviewer;
    @SerializedName("dealerReviewRating")
    @Expose
    private Integer dealerReviewRating;
    @SerializedName("dealerReviewCount")
    @Expose
    private Integer dealerReviewCount;
    @SerializedName("onlineOnly")
    @Expose
    private Boolean onlineOnly;

    public String getCarfaxId() {
        return carfaxId;
    }

    public void setCarfaxId(String carfaxId) {
        this.carfaxId = carfaxId;
    }

    public String getDealerInventoryUrl() {
        return dealerInventoryUrl;
    }

    public void setDealerInventoryUrl(String dealerInventoryUrl) {
        this.dealerInventoryUrl = dealerInventoryUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Double getDealerAverageRating() {
        return dealerAverageRating;
    }

    public void setDealerAverageRating(Double dealerAverageRating) {
        this.dealerAverageRating = dealerAverageRating;
    }

    public String getDealerReviewDate() {
        return dealerReviewDate;
    }

    public void setDealerReviewDate(String dealerReviewDate) {
        this.dealerReviewDate = dealerReviewDate;
    }

    public String getDealerReviewReviewer() {
        return dealerReviewReviewer;
    }

    public void setDealerReviewReviewer(String dealerReviewReviewer) {
        this.dealerReviewReviewer = dealerReviewReviewer;
    }

    public Integer getDealerReviewRating() {
        return dealerReviewRating;
    }

    public void setDealerReviewRating(Integer dealerReviewRating) {
        this.dealerReviewRating = dealerReviewRating;
    }

    public Integer getDealerReviewCount() {
        return dealerReviewCount;
    }

    public void setDealerReviewCount(Integer dealerReviewCount) {
        this.dealerReviewCount = dealerReviewCount;
    }

    public Boolean getOnlineOnly() {
        return onlineOnly;
    }

    public void setOnlineOnly(Boolean onlineOnly) {
        this.onlineOnly = onlineOnly;
    }

}
