
package com.example.carfaxapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class CarFaxSearch {

    @SerializedName("searchArea")
    @Expose
    private SearchArea searchArea;
    @SerializedName("totalListingCount")
    @Expose
    private Integer totalListingCount;
    @SerializedName("enhancedCount")
    @Expose
    private Integer enhancedCount;
    @SerializedName("backfillCount")
    @Expose
    private Integer backfillCount;
    @SerializedName("dealerNewCount")
    @Expose
    private Integer dealerNewCount;
    @SerializedName("dealerUsedCount")
    @Expose
    private Integer dealerUsedCount;
    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("pageSize")
    @Expose
    private Integer pageSize;
    @SerializedName("totalPageCount")
    @Expose
    private Integer totalPageCount;
    @SerializedName("listings")
    @Expose
    private List<Listing> listings = null;

    public SearchArea getSearchArea() {
        return searchArea;
    }

    public void setSearchArea(SearchArea searchArea) {
        this.searchArea = searchArea;
    }

    public Integer getTotalListingCount() {
        return totalListingCount;
    }

    public void setTotalListingCount(Integer totalListingCount) {
        this.totalListingCount = totalListingCount;
    }

    public Integer getEnhancedCount() {
        return enhancedCount;
    }

    public void setEnhancedCount(Integer enhancedCount) {
        this.enhancedCount = enhancedCount;
    }

    public Integer getBackfillCount() {
        return backfillCount;
    }

    public void setBackfillCount(Integer backfillCount) {
        this.backfillCount = backfillCount;
    }

    public Integer getDealerNewCount() {
        return dealerNewCount;
    }

    public void setDealerNewCount(Integer dealerNewCount) {
        this.dealerNewCount = dealerNewCount;
    }

    public Integer getDealerUsedCount() {
        return dealerUsedCount;
    }

    public void setDealerUsedCount(Integer dealerUsedCount) {
        this.dealerUsedCount = dealerUsedCount;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(Integer totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public List<Listing> getListings() {
        return listings;
    }

    public void setListings(List<Listing> listings) {
        this.listings = listings;
    }

}
