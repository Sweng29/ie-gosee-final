package com.gosee.ie.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Entity
@Table(name = "VEHICLE_COLOR")
public class VehicleColor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "VEHICLE_COLOR_ID")
    private Long vehicleColorId;
    @NotEmpty(message = "Color should not be empty.")
    private String colorName;
    @OneToMany(mappedBy = "vehicleColor")
    @JsonIgnore
    private Set<VehicleDetail> vehicleDetails;
    @Min(1)
    private Short isActive;

    public Set<VehicleDetail> getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(Set<VehicleDetail> vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }

    public Long getVehicleColorId() {
        return vehicleColorId;
    }

    public void setVehicleColorId(Long vehicleColorId) {
        this.vehicleColorId = vehicleColorId;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public Short getIsActive() {
        return isActive;
    }

    public void setIsActive(Short isActive) {
        this.isActive = isActive;
    }
}
