package com.learning.beverages;

public abstract class Beverage {
    public String description = "Unknown beverage type";

    public String getDescription() {
        return description;
    }

    public abstract Double cost();

}