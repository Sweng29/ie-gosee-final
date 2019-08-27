package com.gosee.ie.dto.transformer;

import com.gosee.ie.dto.FuelTypeDTO;
import com.gosee.ie.dto.VehicleDetailDTO;
import com.gosee.ie.model.FuelType;

public class FuelTypeTransformer {

    public static FuelTypeDTO transform(FuelType fuelType) {
        FuelTypeDTO fuelTypeDTO = new FuelTypeDTO();
        if (fuelType.getFuelTypeId() != null) {
            fuelTypeDTO.setFuelTypeId(String.valueOf(fuelType.getFuelTypeId()));
        }
        if (fuelType.getFuelType() != null) {
            fuelTypeDTO.setFuelType(fuelType.getFuelType());
        }
        if (fuelType.getVehicleDetail() != null) {
            VehicleDetailDTO vehicleDetailDTO = VehicleDetailTransformer.transform(fuelType.getVehicleDetail());
            fuelTypeDTO.setVehicleDetailDTO(vehicleDetailDTO);
        }
        return fuelTypeDTO;
    }
}
