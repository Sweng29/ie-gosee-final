package com.gosee.ie.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "FUEL_TYPE")
public class FuelType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "FUEL_TYPE_ID")
    private Long fuelTypeId;
    @NotEmpty(message = "Fuel type should not be empty.")
    private String fuelType;
    @OneToOne(mappedBy = "fuelType")
    private VehicleDetail vehicleDetail;
    @Min(1)
    private Short isActive;

    public VehicleDetail getVehicleDetail() {
        return vehicleDetail;
    }

    public void setVehicleDetail(VehicleDetail vehicleDetail) {
        this.vehicleDetail = vehicleDetail;
    }

    public Long getFuelTypeId() {
        return fuelTypeId;
    }

    public void setFuelTypeId(Long fuelTypeId) {
        this.fuelTypeId = fuelTypeId;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Short getIsActive() {
        return isActive;
    }

    public void setIsActive(Short isActive) {
        this.isActive = isActive;
    }
}
