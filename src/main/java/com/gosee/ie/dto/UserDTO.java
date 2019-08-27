package com.gosee.ie.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UserDTO {

    private String userId;
    @NotEmpty(message = "First name should not be empty.")
    @Min(3)
    private String firstName;
    @NotEmpty(message = "Last name should not be empty.")
    @Min(3)
    private String lastName;
    @NotEmpty(message = "Username should not be empty.")
    @NotNull(message = "Username should not be null.")
    @Min(3)
    private String username;
    @Email(message = "Email address is not valid")
    @NotEmpty(message = "Email address should not be empty.")
    @NotNull(message = "Email address should not be null.")
    private String emailAddress;
    @NotEmpty(message = "Password should not be empty.")
    @NotNull(message = "Password should not be empty.")
    @Min(value = 6, message = "Password should be greater then 6 length.")
    private String password;
    @NotEmpty(message = "Confirm Password should not be empty.")
    @NotNull(message = "Confirm Password should not be empty.")
    private String confirmPassword;
    @NotEmpty(message = "Date of birth should not be empty.")
    private String dateOfBirth;
    @NotEmpty(message = "Please provide your address.")
    private String address;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
