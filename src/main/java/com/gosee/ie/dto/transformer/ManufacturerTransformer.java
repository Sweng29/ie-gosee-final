package com.gosee.ie.dto.transformer;

import com.gosee.ie.dto.ManufacturerDTO;
import com.gosee.ie.model.Manufacturer;

public class ManufacturerTransformer {

    public static ManufacturerDTO transform(Manufacturer manufacturer) {
        ManufacturerDTO manufacturerDTO = new ManufacturerDTO();
        if (manufacturer.getManufacturerId() != null) {
            manufacturerDTO.setManufacturerId(String.valueOf(manufacturer.getManufacturerId()));
        }
        if (manufacturer.getManufacturerName() != null) {
            manufacturerDTO.setManufacturerName(manufacturer.getManufacturerName());
        }
        return manufacturerDTO;
    }

}
