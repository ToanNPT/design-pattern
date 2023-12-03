package com.learning.models;

import com.learning.impl.UserDTOConcreteBuilder;
import com.learning.interfaces.UserDTOBuilder;

import java.util.Date;

public class UserDTO {
    private Integer userId;
    private String username;
    private String familyName;
    private Date dob;
    private String phoneNumber;
    private String email;

    public UserDTO(Integer userId, String username, String familyName, Date dob, String phoneNumber, String email) {
        this.userId = userId;
        this.username = username;
        this.familyName = familyName;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public static UserDTOBuilder builder() {
        return new UserDTOConcreteBuilder();
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getFamilyName() {
        return familyName;
    }

    public Date getDob() {
        return dob;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", familyName='" + familyName + '\'' +
                ", dob=" + dob +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
