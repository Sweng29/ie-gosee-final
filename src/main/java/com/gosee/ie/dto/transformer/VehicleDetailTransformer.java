package com.gosee.ie.dto.transformer;

import com.gosee.ie.dto.*;
import com.gosee.ie.model.FileUpload;
import com.gosee.ie.model.VehicleDetail;

import java.util.HashSet;
import java.util.Set;

public class VehicleDetailTransformer {

    public static VehicleDetailDTO transform(VehicleDetail vehicleDetail) {
        VehicleDetailDTO vehicleDetailDTO = new VehicleDetailDTO();
        if (vehicleDetail.getCategory() != null) {
            CategoryDTO categoryDTO = CategoryTransformer.transform(vehicleDetail.getCategory());
            vehicleDetailDTO.setCategoryDTO(categoryDTO);
        }
        if (vehicleDetail.getChassisNo() != null) {
            vehicleDetailDTO.setChassisNo(vehicleDetail.getChassisNo());
        }
        if (vehicleDetail.getEngineCapacity() != null) {
            vehicleDetailDTO.setEngineCapacity(vehicleDetail.getEngineCapacity());
        }
        if (vehicleDetail.getEngineNo() != null) {
            vehicleDetailDTO.setEngineNo(vehicleDetail.getEngineNo());
        }
        if (vehicleDetail.getEngineSize() != null) {
            vehicleDetailDTO.setEngineSize(vehicleDetail.getEngineSize());
        }
        if (vehicleDetail.getFuelEconomy() != null) {
            vehicleDetailDTO.setFuelEconomy(vehicleDetail.getFuelEconomy());
        }
        if (vehicleDetail.getFuelType() != null) {
            FuelTypeDTO fuelTypeDTO = FuelTypeTransformer.transform(vehicleDetail.getFuelType());
            vehicleDetailDTO.setFuelTypeDTO(fuelTypeDTO);
        }
        if (vehicleDetail.getManufacturer() != null) {
            ManufacturerDTO manufacturerDTO = ManufacturerTransformer.transform(vehicleDetail.getManufacturer());
            vehicleDetailDTO.setManufacturerDTO(manufacturerDTO);
        }
        if (vehicleDetail.getMileageUnit() != null && vehicleDetail.getMiles() != null) {
            vehicleDetailDTO.setMileage(vehicleDetail.getMiles() + " " + vehicleDetail.getMileageUnit().toString());
        }
        if (vehicleDetail.getNoOfDoors() != null) {
            vehicleDetailDTO.setNoOfDoors(vehicleDetail.getNoOfDoors());
        }
        if (vehicleDetail.getRegistrationDate() != null) {
            vehicleDetailDTO.setRegistrationDate(vehicleDetail.getRegistrationDate());
        }
        if (vehicleDetail.getRegistrationNo() != null) {
            vehicleDetailDTO.setRegistrationNo(vehicleDetail.getRegistrationNo());
        }
        if (vehicleDetail.getTransmissionType() != null) {
            TransmissionTypeDTO transmissionTypeDTO = TransmissionTypeTransformer.transform(vehicleDetail.getTransmissionType());
            vehicleDetailDTO.setTransmissionTypeDTO(transmissionTypeDTO);
        }
        if (vehicleDetail.getVehicleColor() != null) {
            VehicleColorDTO vehicleColorDTO = VehicleColorTransformer.transform(vehicleDetail.getVehicleColor());
            vehicleDetailDTO.setVehicleColorDTO(vehicleColorDTO);
        }
        if (vehicleDetail.getVehicleDetailId() != null) {
            vehicleDetailDTO.setVehicleDetailId(String.valueOf(vehicleDetail.getVehicleDetailId()));
        }
        if (vehicleDetail.getVehicleName() != null) {
            vehicleDetailDTO.setVehicleName(vehicleDetail.getVehicleName());
        }
        if (vehicleDetail.getPrice() != null) {
            vehicleDetailDTO.setPrice(String.valueOf(vehicleDetail.getPrice()));
        }
        if (vehicleDetail.getFileUpload() != null) {
            Set<FileUploadDTO> images = new HashSet<>();
            for (FileUpload fileUpload : vehicleDetail.getFileUpload()) {
                FileUploadDTO fileUploadDTO = FileUploadTransformer.transform(fileUpload);
                images.add(fileUploadDTO);
            }
            vehicleDetailDTO.setImages(images);
        }
        if (vehicleDetail.getBodyType() != null) {
            vehicleDetailDTO.setBodyType(vehicleDetail.getBodyType().getName());
        }
        if (vehicleDetail.getModelYear() != null) {
            vehicleDetailDTO.setModelYear(vehicleDetail.getModelYear());
        }
        if (vehicleDetail.getCurrencyType() != null) {
            vehicleDetailDTO.setCurrencyType(vehicleDetail.getCurrencyType().toString());
        }
        if (vehicleDetail.getVehicleCondition() != null) {
            vehicleDetailDTO.setVehicleCondition(vehicleDetail.getVehicleCondition().toString());
        }
        if (vehicleDetail.getDescription() != null) {
            vehicleDetailDTO.setDescription(vehicleDetail.getDescription());
        }
        return vehicleDetailDTO;
    }

}
