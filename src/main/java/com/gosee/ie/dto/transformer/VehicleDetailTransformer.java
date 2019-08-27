package com.gosee.ie.dto.transformer;

import com.gosee.ie.dto.*;
import com.gosee.ie.model.VehicleDetail;

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
        if (vehicleDetail.getMileage() != null) {
            vehicleDetailDTO.setMileage(vehicleDetail.getMileage());
        }
        if (vehicleDetail.getNoOfDoors() != null) {
            vehicleDetailDTO.setNoOfDoors(String.valueOf(vehicleDetail.getNoOfDoors()));
        }
        if (vehicleDetail.getRegistrationDate() != null) {
            vehicleDetailDTO.setRegistrationDate(String.valueOf(vehicleDetail.getRegistrationDate()));
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
        return vehicleDetailDTO;
    }

}
