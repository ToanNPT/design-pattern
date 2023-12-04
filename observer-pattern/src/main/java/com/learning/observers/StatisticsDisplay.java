package com.learning.observers;

import com.learning.subjects.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("""
                        The statistics display: %s F degree and %s humidity and %s pressure
                        """,
                temp, humidity, pressure
        );
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temp = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
