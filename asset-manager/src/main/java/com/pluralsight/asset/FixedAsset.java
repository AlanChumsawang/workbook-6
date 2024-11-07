package com.pluralsight.asset;

public abstract class FixedAsset {
    protected String name;
    protected double marketValue;

    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public abstract double getValue();
}
