package com.gosee.ie.dto.transformer;

import com.gosee.ie.dto.CategoryDTO;
import com.gosee.ie.dto.VehicleDetailDTO;
import com.gosee.ie.model.Category;

public class CategoryTransformer {

    public static CategoryDTO transform(Category category) {
        CategoryDTO categoryDTO = new CategoryDTO();
        if (category.getCategoryId() != null) {
            categoryDTO.setCategoryId(String.valueOf(category.getCategoryId()));
        }
        if (category.getName() != null) {
            categoryDTO.setCategoryName(category.getName());
        }
        if (category.getVehicleDetail() != null) {
            VehicleDetailDTO vehicleDetailDTO = VehicleDetailTransformer.transform(category.getVehicleDetail());
            categoryDTO.setVehicleDetailDTO(vehicleDetailDTO);
        }
        return categoryDTO;
    }

}
