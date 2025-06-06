package com.example.vo;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestUser {

    @Email
    @NotNull(message = "Email cannot be null")
    @Size(min = 2, message = "Email not be less then two characters")
    private String email;

    @NotNull(message = "Name cannot be null")
    @Size(min = 2, message = "name not be less then two characters")
    private String name;

    @NotNull(message = "Password cannot be null")
    @Size(min = 8, message = "Password must be equal or greater than 8 characters")
    private String pwd;

}
