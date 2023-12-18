package com.learning.condiments;

import com.learning.beverages.Beverage;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Double cost() {
        return beverage.cost() + 0.2;
    }

    @Override
    public String getDescription() {
        String desc = "";
        if (beverage instanceof CondimentDecorator) {
            desc = beverage.getDescription() + ", Mocha";
        } else {
            desc = beverage.getDescription() + " with Topping: Mocha ";
        }
        return desc;
    }
}
