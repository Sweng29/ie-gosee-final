package com.gosee.ie.controller;

import com.gosee.ie.exception.ResourceNotFoundException;
import com.gosee.ie.model.FuelType;
import com.gosee.ie.service.FuelTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@RestController
@RequestMapping(value = "/api/fueltypes")
public class FuelTypeController {

    @Autowired
    private FuelTypeService fuelTypeService;

    @GetMapping
    public ResponseEntity findAllByIsActive() {
        return ResponseEntity.ok().body(fuelTypeService.findAllByIsActive());
    }

    @GetMapping(value = "/fueltype/{id}")
    public ResponseEntity<FuelType> findByIdAndIsActive(@PathVariable @Min(1) Long id) throws ResourceNotFoundException {
        if (id != null) {
            FuelType fuelType = fuelTypeService.findByIdIsActive(id).orElseThrow(() -> new ResourceNotFoundException("Fuel type not found on :: " + id));
            return ResponseEntity.ok().body(fuelType);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity saveFuelType(@Valid @RequestBody FuelType fuelType) {
        fuelType.setIsActive((short) 1);
        return ResponseEntity.ok().body(fuelTypeService.saveOrUpdate(fuelType));
    }

    @PutMapping("/fueltype/{id}")
    public ResponseEntity updateFuelType(@Valid @RequestBody FuelType fuelType, @PathVariable @Min(1) Long id) throws ResourceNotFoundException {

        if (id != null) {
            FuelType fuelType1 = fuelTypeService.findByIdIsActive(id).orElseThrow(() -> new ResourceNotFoundException("Category not found on :: " + id));
            fuelType1 = fuelType;
            fuelType1.setIsActive((short) 1);
            fuelType1.setFuelTypeId(id);
            return ResponseEntity.ok().body(fuelTypeService.saveOrUpdate(fuelType));
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/fueltype/{id}")
    public ResponseEntity deleteById(@PathVariable @Min(1) Long id) {
        if (id != null) {
            fuelTypeService.deleteByIdIsActive(id);
            return ResponseEntity.ok().body("Record deleted successfully!");
        }
        return ResponseEntity.notFound().build();
    }

}
