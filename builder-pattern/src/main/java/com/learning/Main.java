package com.learning;

import com.learning.interfaces.LaptopBuilder;
import com.learning.models.Laptop;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        var laptop = Laptop.builder()
                .setBattery("3 Cell Battery")
                .setCpu("Tiger lake i5-1135G7")
                .setColor("Carbon Grey")
                .setDeviceName("MSI Modern 14 B11MOU-861IN Laptop")
                .setOs("Windows 11")
                .setRAM(16)
                .setSSD(512)
                .dimensions("319 x 219 x 16.9 mm")
                .setWarranty("1 Year")
                .setBarCode("B11MOU-861IN")
                .build();
        System.out.println(laptop);
    }
}