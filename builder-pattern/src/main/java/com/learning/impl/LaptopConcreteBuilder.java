package com.learning.impl;

import com.learning.interfaces.LaptopBuilder;
import com.learning.models.Laptop;

public class LaptopConcreteBuilder implements LaptopBuilder {

    private String barCode;
    private String deviceName;
    private String color;
    private String cpu;
    private String os;
    private Integer ssd;
    private Integer ram;
    private String battery;
    private String webCam;
    private String ledKeyBoard;
    private String dimensions;
    private String warranty;


    @Override
    public LaptopBuilder setBarCode(String barCode) {
        this.barCode = barCode;
        return this;
    }

    @Override
    public LaptopBuilder setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    @Override
    public LaptopBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public LaptopBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    @Override
    public LaptopBuilder setOs(String operateSystem) {
        this.os = operateSystem;
        return this;
    }

    @Override
    public LaptopBuilder setSSD(Integer ssdCapacity) {
        this.ssd = ssdCapacity;
        return this;
    }

    @Override
    public LaptopBuilder setRAM(Integer ramCapacity) {
        this.ram = ramCapacity;
        return this;
    }

    @Override
    public LaptopBuilder setBattery(String batteryCapacity) {
        this.battery = batteryCapacity;
        return this;
    }

    @Override
    public LaptopBuilder setWebCam(String webcam) {
        this.webCam = webcam;
        return this;
    }

    @Override
    public LaptopBuilder setLedKeyBoard(String ledKeyBoard) {
        this.ledKeyBoard = ledKeyBoard;
        return this;
    }

    @Override
    public LaptopBuilder setWarranty(String warranty) {
        this.warranty = warranty;
        return this;
    }

    @Override
    public LaptopBuilder dimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    @Override
    public Laptop build() {
        return new Laptop(
                barCode, deviceName, color, cpu, os, ssd, ram,
                battery, webCam, ledKeyBoard, dimensions, warranty
        );
    }
}
