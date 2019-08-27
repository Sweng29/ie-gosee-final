package com.gosee.ie.dto;

public class VehicleColorDTO {

    private String vehicleColorId;
    private String vehicleColor;
    private VehicleDetailDTO vehicleDetailDTO;

    public VehicleDetailDTO getVehicleDetailDTO() {
        return vehicleDetailDTO;
    }

    public void setVehicleDetailDTO(VehicleDetailDTO vehicleDetailDTO) {
        this.vehicleDetailDTO = vehicleDetailDTO;
    }

    public String getVehicleColorId() {
        return vehicleColorId;
    }

    public void setVehicleColorId(String vehicleColorId) {
        this.vehicleColorId = vehicleColorId;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }
}
