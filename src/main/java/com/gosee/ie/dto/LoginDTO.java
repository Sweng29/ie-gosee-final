package com.gosee.ie.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class LoginDTO {

    @NotEmpty(message = "Please enter a valid username or email address")
    private String usernameOrEmailAddress;
    @NotEmpty(message = "Please enter a valid password")
    @Min(6)
    private String password;

    public String getUsernameOrEmailAddress() {
        return usernameOrEmailAddress;
    }

    public void setUsernameOrEmailAddress(String usernameOrEmailAddress) {
        this.usernameOrEmailAddress = usernameOrEmailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
