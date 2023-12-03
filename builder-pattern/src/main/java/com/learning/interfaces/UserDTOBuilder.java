package com.learning.interfaces;

import com.learning.models.UserDTO;

import java.util.Date;

public interface UserDTOBuilder {
    UserDTOBuilder setUserId(Integer userId);

    UserDTOBuilder setUsername(String username);

    UserDTOBuilder setFamilyName(String familyName);

    UserDTOBuilder setDob(Date dob);

    UserDTOBuilder setPhoneNumber(String phoneNumber);

    UserDTOBuilder setEmail(String email);

    UserDTO build();

}
