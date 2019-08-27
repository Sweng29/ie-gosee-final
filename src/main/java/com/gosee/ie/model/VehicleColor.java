package com.gosee.ie.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "VEHICLE_COLOR")
public class VehicleColor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "VEHICLE_COLOR_ID")
    private Long vehicleColorId;
    @NotEmpty(message = "Color should not be empty.")
    private String colorName;
    @OneToOne(mappedBy = "vehicleColor")
    private VehicleDetail vehicleDetail;
    @Min(1)
    private Short isActive;

    public VehicleDetail getVehicleDetail() {
        return vehicleDetail;
    }

    public void setVehicleDetail(VehicleDetail vehicleDetail) {
        this.vehicleDetail = vehicleDetail;
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
