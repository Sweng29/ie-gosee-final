package com.gosee.ie.dto;

public class FuelTypeDTO {

    private String fuelTypeId;
    private String fuelType;
    private VehicleDetailDTO vehicleDetailDTO;

    public String getFuelTypeId() {
        return fuelTypeId;
    }

    public void setFuelTypeId(String fuelTypeId) {
        this.fuelTypeId = fuelTypeId;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public VehicleDetailDTO getVehicleDetailDTO() {
        return vehicleDetailDTO;
    }

    public void setVehicleDetailDTO(VehicleDetailDTO vehicleDetailDTO) {
        this.vehicleDetailDTO = vehicleDetailDTO;
    }
}
