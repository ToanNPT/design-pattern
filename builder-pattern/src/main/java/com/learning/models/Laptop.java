package com.learning.models;

import com.learning.impl.LaptopConcreteBuilder;
import com.learning.interfaces.LaptopBuilder;

public class Laptop {
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

    public Laptop(
            String barCode, String deviceName, String color, String cpu, String os, Integer ssd, Integer ram,
            String battery, String webCam, String ledKeyBoard, String dimensions, String warranty
    ) {
        this.barCode = barCode;
        this.deviceName = deviceName;
        this.color = color;
        this.cpu = cpu;
        this.os = os;
        this.ssd = ssd;
        this.ram = ram;
        this.battery = battery;
        this.webCam = webCam;
        this.ledKeyBoard = ledKeyBoard;
        this.dimensions = dimensions;
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "barCode='" + barCode + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", color='" + color + '\'' +
                ", cpu='" + cpu + '\'' +
                ", os='" + os + '\'' +
                ", ssd=" + ssd +
                ", ram=" + ram +
                ", battery='" + battery + '\'' +
                ", webCam='" + webCam + '\'' +
                ", ledKeyBoard='" + ledKeyBoard + '\'' +
                ", dimensions='" + dimensions + '\'' +
                ", warranty='" + warranty + '\'' +
                '}';
    }

    public static LaptopBuilder builder() {
        return new LaptopConcreteBuilder();
    }

    public String getBarCode() {
        return barCode;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getColor() {
        return color;
    }

    public String getCpu() {
        return cpu;
    }

    public String getOs() {
        return os;
    }

    public Integer getSsd() {
        return ssd;
    }

    public Integer getRam() {
        return ram;
    }

    public String getBattery() {
        return battery;
    }

    public String getWebCam() {
        return webCam;
    }

    public String getLedKeyBoard() {
        return ledKeyBoard;
    }

    public String getDimensions() {
        return dimensions;
    }

    public String getWarranty() {
        return warranty;
    }

}
