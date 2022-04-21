
package com.example.carfaxapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class MonthlyPaymentEstimate {

    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("downPaymentPercent")
    @Expose
    private Double downPaymentPercent;
    @SerializedName("interestRate")
    @Expose
    private Double interestRate;
    @SerializedName("termInMonths")
    @Expose
    private Integer termInMonths;
    @SerializedName("loanAmount")
    @Expose
    private Double loanAmount;
    @SerializedName("downPaymentAmount")
    @Expose
    private Double downPaymentAmount;
    @SerializedName("monthlyPayment")
    @Expose
    private Double monthlyPayment;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDownPaymentPercent() {
        return downPaymentPercent;
    }

    public void setDownPaymentPercent(Double downPaymentPercent) {
        this.downPaymentPercent = downPaymentPercent;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Integer getTermInMonths() {
        return termInMonths;
    }

    public void setTermInMonths(Integer termInMonths) {
        this.termInMonths = termInMonths;
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Double getDownPaymentAmount() {
        return downPaymentAmount;
    }

    public void setDownPaymentAmount(Double downPaymentAmount) {
        this.downPaymentAmount = downPaymentAmount;
    }

    public Double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(Double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

}
