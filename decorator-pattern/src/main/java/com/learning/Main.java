package com.learning;

import com.learning.beverages.Beverage;
import com.learning.beverages.Espresso;
import com.learning.beverages.HouseBlend;
import com.learning.condiments.Mocha;
import com.learning.condiments.Soy;
import com.learning.condiments.Whip;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        beverage= new Mocha(beverage);

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Soy(houseBlend);

        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}