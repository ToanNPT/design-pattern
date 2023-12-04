package com.learning.subjects;

import com.learning.interfaces.Observer;
import com.learning.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> obServers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.obServers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        obServers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        obServers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : obServers) {
            observer.update(temp, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
