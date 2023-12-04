package com.learning.observers;

import com.learning.subjects.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("""
                The current condition: %s F degree and %s humidity
                """,
                temp, humidity
        );
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temp = temperature;
        this.humidity = humidity;
        display();
    }
}
