package com.gosee.ie.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "MANUFACTURER")
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MANUFACTURER_ID")
    private Long manufacturerId;
    @NotEmpty(message = "Manufacturer name should not be empty.")
    private String manufacturerName;
    @Min(1)
    private Short isActive;

    public Long getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Long manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public Short getIsActive() {
        return isActive;
    }

    public void setIsActive(Short isActive) {
        this.isActive = isActive;
    }
}
