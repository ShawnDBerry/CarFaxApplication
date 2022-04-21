
package com.example.carfaxapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Listing {

    @SerializedName("dealer")
    @Expose
    private Dealer dealer;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("vin")
    @Expose
    private String vin;
    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("make")
    @Expose
    private String make;
    @SerializedName("model")
    @Expose
    private String model;
    @SerializedName("trim")
    @Expose
    private String trim;
    @SerializedName("subTrim")
    @Expose
    private String subTrim;
    @SerializedName("topOptions")
    @Expose
    private List<String> topOptions = null;
    @SerializedName("mileage")
    @Expose
    private Integer mileage;
    @SerializedName("listPrice")
    @Expose
    private Double listPrice;
    @SerializedName("currentPrice")
    @Expose
    private Double currentPrice;
    @SerializedName("monthlyPaymentEstimate")
    @Expose
    private MonthlyPaymentEstimate monthlyPaymentEstimate;
    @SerializedName("onePrice")
    @Expose
    private Double onePrice;
    @SerializedName("badge")
    @Expose
    private String badge;
    @SerializedName("exteriorColor")
    @Expose
    private String exteriorColor;
    @SerializedName("interiorColor")
    @Expose
    private String interiorColor;
    @SerializedName("engine")
    @Expose
    private String engine;
    @SerializedName("displacement")
    @Expose
    private String displacement;
    @SerializedName("drivetype")
    @Expose
    private String drivetype;
    @SerializedName("transmission")
    @Expose
    private String transmission;
    @SerializedName("fuel")
    @Expose
    private String fuel;
    @SerializedName("mpgCity")
    @Expose
    private Integer mpgCity;
    @SerializedName("mpgHighway")
    @Expose
    private Integer mpgHighway;
    @SerializedName("bodytype")
    @Expose
    private String bodytype;
    @SerializedName("vehicleCondition")
    @Expose
    private String vehicleCondition;
    @SerializedName("cabType")
    @Expose
    private String cabType;
    @SerializedName("bedLength")
    @Expose
    private String bedLength;
    @SerializedName("followCount")
    @Expose
    private Integer followCount;
    @SerializedName("stockNumber")
    @Expose
    private String stockNumber;
    @SerializedName("imageCount")
    @Expose
    private Integer imageCount;
    @SerializedName("images")
    @Expose
    private Images images;
    @SerializedName("firstSeen")
    @Expose
    private String firstSeen;
    @SerializedName("oneOwner")
    @Expose
    private Boolean oneOwner;
    @SerializedName("noAccidents")
    @Expose
    private Boolean noAccidents;
    @SerializedName("serviceRecords")
    @Expose
    private Boolean serviceRecords;
    @SerializedName("personalUse")
    @Expose
    private Boolean personalUse;
    @SerializedName("distanceToDealer")
    @Expose
    private Double distanceToDealer;
    @SerializedName("hasViewed")
    @Expose
    private Boolean hasViewed;
    @SerializedName("sentLead")
    @Expose
    private Boolean sentLead;
    @SerializedName("sentLeadAt")
    @Expose
    private Object sentLeadAt;
    @SerializedName("recordType")
    @Expose
    private String recordType;
    @SerializedName("dealerType")
    @Expose
    private String dealerType;
    @SerializedName("backfill")
    @Expose
    private Boolean backfill;
    @SerializedName("advantage")
    @Expose
    private Boolean advantage;
    @SerializedName("vdpUrl")
    @Expose
    private String vdpUrl;
    @SerializedName("sortScore")
    @Expose
    private Double sortScore;
    @SerializedName("isEnriched")
    @Expose
    private Boolean isEnriched;
    @SerializedName("following")
    @Expose
    private Boolean following;
    @SerializedName("onlineOnly")
    @Expose
    private Boolean onlineOnly;
    @SerializedName("certified")
    @Expose
    private Boolean certified;

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public String getSubTrim() {
        return subTrim;
    }

    public void setSubTrim(String subTrim) {
        this.subTrim = subTrim;
    }

    public List<String> getTopOptions() {
        return topOptions;
    }

    public void setTopOptions(List<String> topOptions) {
        this.topOptions = topOptions;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Double getListPrice() {
        return listPrice;
    }

    public void setListPrice(Double listPrice) {
        this.listPrice = listPrice;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public MonthlyPaymentEstimate getMonthlyPaymentEstimate() {
        return monthlyPaymentEstimate;
    }

    public void setMonthlyPaymentEstimate(MonthlyPaymentEstimate monthlyPaymentEstimate) {
        this.monthlyPaymentEstimate = monthlyPaymentEstimate;
    }

    public Double getOnePrice() {
        return onePrice;
    }

    public void setOnePrice(Double onePrice) {
        this.onePrice = onePrice;
    }

    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge;
    }

    public String getExteriorColor() {
        return exteriorColor;
    }

    public void setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }

    public String getInteriorColor() {
        return interiorColor;
    }

    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getDrivetype() {
        return drivetype;
    }

    public void setDrivetype(String drivetype) {
        this.drivetype = drivetype;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public Integer getMpgCity() {
        return mpgCity;
    }

    public void setMpgCity(Integer mpgCity) {
        this.mpgCity = mpgCity;
    }

    public Integer getMpgHighway() {
        return mpgHighway;
    }

    public void setMpgHighway(Integer mpgHighway) {
        this.mpgHighway = mpgHighway;
    }

    public String getBodytype() {
        return bodytype;
    }

    public void setBodytype(String bodytype) {
        this.bodytype = bodytype;
    }

    public String getVehicleCondition() {
        return vehicleCondition;
    }

    public void setVehicleCondition(String vehicleCondition) {
        this.vehicleCondition = vehicleCondition;
    }

    public String getCabType() {
        return cabType;
    }

    public void setCabType(String cabType) {
        this.cabType = cabType;
    }

    public String getBedLength() {
        return bedLength;
    }

    public void setBedLength(String bedLength) {
        this.bedLength = bedLength;
    }

    public Integer getFollowCount() {
        return followCount;
    }

    public void setFollowCount(Integer followCount) {
        this.followCount = followCount;
    }

    public String getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(String stockNumber) {
        this.stockNumber = stockNumber;
    }

    public Integer getImageCount() {
        return imageCount;
    }

    public void setImageCount(Integer imageCount) {
        this.imageCount = imageCount;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public String getFirstSeen() {
        return firstSeen;
    }

    public void setFirstSeen(String firstSeen) {
        this.firstSeen = firstSeen;
    }

    public Boolean getOneOwner() {
        return oneOwner;
    }

    public void setOneOwner(Boolean oneOwner) {
        this.oneOwner = oneOwner;
    }

    public Boolean getNoAccidents() {
        return noAccidents;
    }

    public void setNoAccidents(Boolean noAccidents) {
        this.noAccidents = noAccidents;
    }

    public Boolean getServiceRecords() {
        return serviceRecords;
    }

    public void setServiceRecords(Boolean serviceRecords) {
        this.serviceRecords = serviceRecords;
    }

    public Boolean getPersonalUse() {
        return personalUse;
    }

    public void setPersonalUse(Boolean personalUse) {
        this.personalUse = personalUse;
    }

    public Double getDistanceToDealer() {
        return distanceToDealer;
    }

    public void setDistanceToDealer(Double distanceToDealer) {
        this.distanceToDealer = distanceToDealer;
    }

    public Boolean getHasViewed() {
        return hasViewed;
    }

    public void setHasViewed(Boolean hasViewed) {
        this.hasViewed = hasViewed;
    }

    public Boolean getSentLead() {
        return sentLead;
    }

    public void setSentLead(Boolean sentLead) {
        this.sentLead = sentLead;
    }

    public Object getSentLeadAt() {
        return sentLeadAt;
    }

    public void setSentLeadAt(Object sentLeadAt) {
        this.sentLeadAt = sentLeadAt;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getDealerType() {
        return dealerType;
    }

    public void setDealerType(String dealerType) {
        this.dealerType = dealerType;
    }

    public Boolean getBackfill() {
        return backfill;
    }

    public void setBackfill(Boolean backfill) {
        this.backfill = backfill;
    }

    public Boolean getAdvantage() {
        return advantage;
    }

    public void setAdvantage(Boolean advantage) {
        this.advantage = advantage;
    }

    public String getVdpUrl() {
        return vdpUrl;
    }

    public void setVdpUrl(String vdpUrl) {
        this.vdpUrl = vdpUrl;
    }

    public Double getSortScore() {
        return sortScore;
    }

    public void setSortScore(Double sortScore) {
        this.sortScore = sortScore;
    }

    public Boolean getIsEnriched() {
        return isEnriched;
    }

    public void setIsEnriched(Boolean isEnriched) {
        this.isEnriched = isEnriched;
    }

    public Boolean getFollowing() {
        return following;
    }

    public void setFollowing(Boolean following) {
        this.following = following;
    }

    public Boolean getOnlineOnly() {
        return onlineOnly;
    }

    public void setOnlineOnly(Boolean onlineOnly) {
        this.onlineOnly = onlineOnly;
    }

    public Boolean getCertified() {
        return certified;
    }

    public void setCertified(Boolean certified) {
        this.certified = certified;
    }

}
