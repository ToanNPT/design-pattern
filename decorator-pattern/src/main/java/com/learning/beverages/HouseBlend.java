package com.learning.beverages;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        this.description = "House Blend Coffee ";
    }

    @Override
    public Double cost() {
        return 3.1;
    }
}
