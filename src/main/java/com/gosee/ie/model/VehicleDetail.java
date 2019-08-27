package com.gosee.ie.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name = "VEHICLE_DETAIL")
public class VehicleDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "VEHICLE_DETAIL_ID")
    private Long vehicleDetailId;
    @NotEmpty(message = "Vehicle name should not be empty.")
    private String vehicleName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MANUFACTURER_ID")
    private Manufacturer manufacturer;
    @NotEmpty(message = "Registration number should not be empty.")
    private String registrationNo;
    private Date registrationDate;
    @NotEmpty(message = "Engine number should not be empty.")
    private String engineNo;
    @NotEmpty(message = "Chassis number should not be empty.")
    private String chassisNo;
    @NotEmpty(message = "Engine Capacity should not be empty.")
    private String engineCapacity;
    @NotEmpty(message = "No of doors should not be empty.")
    @Min(1)
    private Integer noOfDoors;
    @ManyToOne
    @JoinColumn(name = "TRANSMITTION_ID")
    private TransmissionType transmissionType;
    @OneToOne
    @JoinColumn(name = "CATEGORY_ID", referencedColumnName = "CATEGORY_ID")
    private Category category;
    @OneToOne
    @JoinColumn(name = "FUEL_TYPE_ID", referencedColumnName = "FUEL_TYPE_ID")
    private FuelType fuelType;
    @Min(value = 0, message = "Mileage should not be less then 0")
    private String mileage;
    @OneToOne
    @JoinColumn(name = "VEHICLE_COLOR_ID", referencedColumnName = "VEHICLE_COLOR_ID")
    private VehicleColor vehicleColor;
    private String engineSize;
    @NotEmpty(message = "Fuel Economy should not be empty.")
    private String fuelEconomy;
    @Min(1)
    private Short isActive;

    public Short getIsActive() {
        return isActive;
    }

    public void setIsActive(Short isActive) {
        this.isActive = isActive;
    }

    public VehicleColor getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(VehicleColor vehicleColor) {
        this.vehicleColor = vehicleColor;
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

    public Long getVehicleDetailId() {
        return vehicleDetailId;
    }

    public void setVehicleDetailId(Long vehicleDetailId) {
        this.vehicleDetailId = vehicleDetailId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
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

    public Integer getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(Integer noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }
}
