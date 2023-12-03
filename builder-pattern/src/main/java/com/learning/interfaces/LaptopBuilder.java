package com.learning.interfaces;

import com.learning.models.Laptop;

public interface LaptopBuilder {
    LaptopBuilder setBarCode(String barCode);

    LaptopBuilder setDeviceName(String deviceName);

    LaptopBuilder setColor(String color);

    LaptopBuilder setCpu(String cpu);

    LaptopBuilder setOs(String operateSystem);

    LaptopBuilder setSSD(Integer ssdCapacity);

    LaptopBuilder setRAM(Integer ramCapacity);

    LaptopBuilder setBattery(String batteryCapacity);

    LaptopBuilder setWebCam(String webcam);

    LaptopBuilder setLedKeyBoard(String ledKeyBoard);

    LaptopBuilder setWarranty(String warranty);

    LaptopBuilder dimensions(String dimensions);

    Laptop build();
}
