package com.company;

public class Asset {
    private int id;
    private double shares;
    private double purchasePrice;

    public int getId(){
        return this.id;
    }

    public double getShares(){
        return this.shares;
    }

    public void setShares(double shares){
        this.shares = shares;
    }

    protected double calculateValue(){
        return 2.0;
    }
}
