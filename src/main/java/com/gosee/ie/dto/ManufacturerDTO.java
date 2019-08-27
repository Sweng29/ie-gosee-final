package com.gosee.ie.dto;

import javax.validation.constraints.NotEmpty;

public class ManufacturerDTO {

    private String manufacturerId;
    @NotEmpty(message = "Manufacturer name should not be empty.")
    private String manufacturerName;

    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
}
