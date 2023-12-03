package com.learning;

import com.learning.models.UserDTO;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        var userDto = UserDTO.builder()
                .setUserId(1)
                .setUsername("toan-aaa")
                .setDob(new Date())
                .setFamilyName("Nguyen Van Toan")
                .setPhoneNumber("0123456")
                .setEmail("toan@gmail.com")
                .build();

        System.out.println(userDto);
    }
}