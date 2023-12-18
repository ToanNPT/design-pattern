package com.learning.beverages;

public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Espresso coffee";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Double cost() {
        return 1.99;
    }
}
