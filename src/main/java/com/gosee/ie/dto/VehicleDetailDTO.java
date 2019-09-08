package com.gosee.ie.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

public class VehicleDetailDTO {

    private String vehicleDetailId;
    @NotEmpty(message = "Vehicle name should not be empty.")
    private String vehicleName;
    @NotNull(message = "Please select manufacturer.")
    private ManufacturerDTO manufacturerDTO;
    @NotEmpty(message = "Registration no should not be empty.")
    private String registrationNo;
    @NotEmpty(message = "Registration date should not be empty.")
    private String registrationDate;
    @NotEmpty(message = "Engine no should not be empty.")
    private String engineNo;
    @NotEmpty(message = "Chassis no should not be empty.")
    private String chassisNo;
    @NotEmpty(message = "Category name should not be empty.")
    private String engineCapacity;
    @NotEmpty(message = "Please select no of doors.")
    private String noOfDoors;
    @NotNull(message = "Please select transmission type.")
    private TransmissionTypeDTO transmissionTypeDTO;
    @NotNull(message = "Please select a category.")
    private CategoryDTO categoryDTO;
    @NotNull(message = "Please select fuel type.")
    private FuelTypeDTO fuelTypeDTO;
    @NotEmpty(message = "Mileage should not be empty.")
    private String mileage;
    @NotNull(message = "Please select vehicle color.")
    private VehicleColorDTO vehicleColorDTO;
    @NotEmpty(message = "Engine size should not be empty.")
    private String engineSize;
    @NotEmpty(message = "Fuel economy should not be empty.")
    private String fuelEconomy;
    private Set<FileUploadDTO> images;
    private String price;
    private String modelYear;
    private String bodyType;
    private String CurrencyType;
    private String vehicleCondition;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCurrencyType() {
        return CurrencyType;
    }

    public void setCurrencyType(String currencyType) {
        CurrencyType = currencyType;
    }

    public String getVehicleCondition() {
        return vehicleCondition;
    }

    public void setVehicleCondition(String vehicleCondition) {
        this.vehicleCondition = vehicleCondition;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Set<FileUploadDTO> getImages() {
        return images;
    }

    public void setImages(Set<FileUploadDTO> images) {
        this.images = images;
    }

    public String getVehicleDetailId() {
        return vehicleDetailId;
    }

    public void setVehicleDetailId(String vehicleDetailId) {
        this.vehicleDetailId = vehicleDetailId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public ManufacturerDTO getManufacturerDTO() {
        return manufacturerDTO;
    }

    public void setManufacturerDTO(ManufacturerDTO manufacturerDTO) {
        this.manufacturerDTO = manufacturerDTO;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(String noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public TransmissionTypeDTO getTransmissionTypeDTO() {
        return transmissionTypeDTO;
    }

    public void setTransmissionTypeDTO(TransmissionTypeDTO transmissionTypeDTO) {
        this.transmissionTypeDTO = transmissionTypeDTO;
    }

    public CategoryDTO getCategoryDTO() {
        return categoryDTO;
    }

    public void setCategoryDTO(CategoryDTO categoryDTO) {
        this.categoryDTO = categoryDTO;
    }

    public FuelTypeDTO getFuelTypeDTO() {
        return fuelTypeDTO;
    }

    public void setFuelTypeDTO(FuelTypeDTO fuelTypeDTO) {
        this.fuelTypeDTO = fuelTypeDTO;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public VehicleColorDTO getVehicleColorDTO() {
        return vehicleColorDTO;
    }

    public void setVehicleColorDTO(VehicleColorDTO vehicleColorDTO) {
        this.vehicleColorDTO = vehicleColorDTO;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    public String getFuelEconomy() {
        return fuelEconomy;
    }

    public void setFuelEconomy(String fuelEconomy) {
        this.fuelEconomy = fuelEconomy;
    }

    @Override
    public String toString() {
        return "VehicleDetailDTO{" +
                "vehicleDetailId='" + vehicleDetailId + '\'' +
                ", vehicleName='" + vehicleName + '\'' +
                ", manufacturerDTO=" + manufacturerDTO +
                ", registrationNo='" + registrationNo + '\'' +
                ", registrationDate='" + registrationDate + '\'' +
                ", engineNo='" + engineNo + '\'' +
                ", chassisNo='" + chassisNo + '\'' +
                ", engineCapacity='" + engineCapacity + '\'' +
                ", noOfDoors='" + noOfDoors + '\'' +
                ", transmissionTypeDTO=" + transmissionTypeDTO +
                ", categoryDTO=" + categoryDTO +
                ", fuelTypeDTO=" + fuelTypeDTO +
                ", mileage='" + mileage + '\'' +
                ", vehicleColorDTO=" + vehicleColorDTO +
                ", engineSize='" + engineSize + '\'' +
                ", fuelEconomy='" + fuelEconomy + '\'' +
                ", images=" + images +
                ", price='" + price + '\'' +
                '}';
    }
}
