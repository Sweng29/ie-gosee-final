package com.gosee.ie.dto.transformer;

import com.gosee.ie.dto.VehicleColorDTO;
import com.gosee.ie.model.VehicleColor;

public class VehicleColorTransformer {

    public static VehicleColorDTO transform(VehicleColor vehicleColor) {
        VehicleColorDTO vehicleColorDTO = new VehicleColorDTO();
        if (vehicleColor.getVehicleColorId() != null) {
            vehicleColorDTO.setVehicleColorId(String.valueOf(vehicleColor.getVehicleColorId()));
        }
        if (vehicleColor.getColorName() != null) {
            vehicleColorDTO.setVehicleColor(vehicleColor.getColorName());
        }
        /*if (vehicleColor.getVehicleDetail() != null) {
            VehicleDetailDTO vehicleDetailDTO = VehicleDetailTransformer.transform(vehicleColor.getVehicleDetail());
            vehicleColorDTO.setVehicleDetailDTO(vehicleDetailDTO);
        }*/
        return vehicleColorDTO;
    }
}
