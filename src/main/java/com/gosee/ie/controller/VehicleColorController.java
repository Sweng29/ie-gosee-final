package com.gosee.ie.controller;

import com.gosee.ie.exception.ResourceNotFoundException;
import com.gosee.ie.model.VehicleColor;
import com.gosee.ie.service.VehicleColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@RestController
@RequestMapping(value = "/api/colors")
public class VehicleColorController {

    @Autowired
    private VehicleColorService vehicleColorService;

    @GetMapping
    public ResponseEntity findAllByIsActive() {
        return ResponseEntity.ok().body(vehicleColorService.findAllByIsActive());
    }

    @GetMapping(value = "/color/{id}")
    public ResponseEntity<VehicleColor> findByIdAndIsActive(@PathVariable @Min(1) Long id) throws ResourceNotFoundException {
        if (id != null) {
            VehicleColor vehicleColor = vehicleColorService.findByIdIsActive(id).orElseThrow(() -> new ResourceNotFoundException("Vehicle color not found on :: " + id));
            return ResponseEntity.ok().body(vehicleColor);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity saveVehicleColor(@Valid @RequestBody VehicleColor vehicleColor) {
        vehicleColor.setIsActive((short) 1);
        return ResponseEntity.ok().body(vehicleColorService.saveOrUpdate(vehicleColor));
    }

    @PutMapping("/color/{id}")
    public ResponseEntity updateVehicleColor(@Valid @RequestBody VehicleColor vehicleColor, @PathVariable @Min(1) Long id) throws ResourceNotFoundException {

        if (id != null) {
            VehicleColor vehicleColor1 = vehicleColorService.findByIdIsActive(id).orElseThrow(() -> new ResourceNotFoundException("Vehicle color not found on :: " + id));
            vehicleColor1 = vehicleColor;
            vehicleColor1.setIsActive((short) 1);
            vehicleColor1.setVehicleColorId(id);
            return ResponseEntity.ok().body(vehicleColorService.saveOrUpdate(vehicleColor1));
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/color/{id}")
    public ResponseEntity deleteById(@PathVariable @Min(1) Long id) {
        if (id != null) {
            vehicleColorService.deleteByIdIsActive(id);
            return ResponseEntity.ok().body("Record deleted successfully!");
        }
        return ResponseEntity.notFound().build();
    }

}
