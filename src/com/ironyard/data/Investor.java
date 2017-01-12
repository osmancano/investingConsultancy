package com.ironyard.data;

/**
 * Created by osmanidris on 1/11/17.
 */
public class Investor {

    private String name;
    private double iAmount;
    private double iProfit;
    private int noOfWeeks;

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    private double percent;

    public double getPercentPerWeek() {
        return percentPerWeek;
    }

    public void setPercentPerWeek(double percentPerWeek) {
        this.percentPerWeek = percentPerWeek;
    }

    private double percentPerWeek;

    public void calcPercent(){
        this.percent = iProfit / iAmount * 100;
        this.percentPerWeek = this.percent / this.noOfWeeks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getiAmount() {
        return iAmount;
    }

    public void setiAmount(double iAmount) {
        this.iAmount = iAmount;
    }

    public double getiProfit() {
        return iProfit;
    }

    public void setiProfit(double iProfit) {
        this.iProfit = iProfit;
    }

    public int getNoOfWeeks() {
        return noOfWeeks;
    }

    public void setNoOfWeeks(int noOfWeeks) {
        this.noOfWeeks = noOfWeeks;
    }



}
