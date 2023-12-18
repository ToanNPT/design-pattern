package com.learning.condiments;

import com.learning.beverages.Beverage;

public class Soy extends CondimentDecorator{
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Double cost() {
        return beverage.cost() + 0.05;
    }

    @Override
    public String getDescription() {
        String desc = "";
        if (beverage instanceof CondimentDecorator) {
            desc = beverage.getDescription() + ", Soy";
        } else {
            desc = beverage.getDescription() + " with Topping: Soy ";
        }
        return desc;
    }
}
