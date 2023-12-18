package com.learning.condiments;

import com.learning.beverages.Beverage;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Double cost() {
        return beverage.cost() + 0.1;
    }

    @Override
    public String getDescription() {
        String desc = "";
        if (beverage instanceof CondimentDecorator) {
            desc = beverage.getDescription() + ", Whip";
        } else {
            desc = beverage.getDescription() + " with Topping: Whip ";
        }
        return desc;
    }
}
