package com.gosee.ie.dto;

import javax.validation.constraints.NotEmpty;

public class CategoryDTO {

    private String categoryId;
    @NotEmpty(message = "Category name should not be empty.")
    private String categoryName;
    private VehicleDetailDTO vehicleDetailDTO;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public VehicleDetailDTO getVehicleDetailDTO() {
        return vehicleDetailDTO;
    }

    public void setVehicleDetailDTO(VehicleDetailDTO vehicleDetailDTO) {
        this.vehicleDetailDTO = vehicleDetailDTO;
    }
}
