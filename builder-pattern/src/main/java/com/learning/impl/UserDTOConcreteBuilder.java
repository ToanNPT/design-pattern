package com.learning.impl;

import com.learning.interfaces.UserDTOBuilder;
import com.learning.models.UserDTO;

import java.util.Date;

public class UserDTOConcreteBuilder implements UserDTOBuilder {
    private Integer userId;
    private String username;
    private String familyName;
    private Date dob;
    private String phoneNumber;
    private String email;

    @Override
    public UserDTOBuilder setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public UserDTOBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    @Override
    public UserDTOBuilder setFamilyName(String familyName) {
        this.familyName = familyName;
        return this;
    }

    @Override
    public UserDTOBuilder setDob(Date dob) {
        this.dob = dob;
        return this;
    }

    @Override
    public UserDTOBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public UserDTOBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public UserDTO build() {
        return new UserDTO(userId, username, familyName, dob, phoneNumber, email);
    }
}
