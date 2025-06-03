package com.example.service;

import com.example.dto.UserDto;
import com.example.jpa.UserEntity;

public interface UserService {


    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);

    Iterable<UserEntity> getUserByAll();

}
