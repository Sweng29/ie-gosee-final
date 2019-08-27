package com.gosee.ie.dto;

public class VehicleDetailDTO {

    private String vehicleDetailId;
    private String vehicleName;
    private ManufacturerDTO manufacturerDTO;
    private String registrationNo;
    private String registrationDate;
    private String engineNo;
    private String chassisNo;
    private String engineCapacity;
    private String noOfDoors;
    private TransmissionTypeDTO transmissionTypeDTO;
    private CategoryDTO categoryDTO;
    private FuelTypeDTO fuelTypeDTO;
    private String mileage;
    private VehicleColorDTO vehicleColorDTO;
    private String engineSize;
    private String fuelEconomy;

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
}
