package com.gosee.ie.controller;

import com.gosee.ie.exception.ResourceNotFoundException;
import com.gosee.ie.model.Manufacturer;
import com.gosee.ie.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@RestController
@RequestMapping(value = "/api/manufacturers")
public class ManufacturerController {

    @Autowired
    private ManufacturerService manufacturerService;

    @GetMapping
    public ResponseEntity findAllByIsActive() {
        return ResponseEntity.ok().body(manufacturerService.findAllByIsActive());
    }

    @GetMapping(value = "/manufacturer/{id}")
    public ResponseEntity<Manufacturer> findByIdAndIsActive(@PathVariable @Min(1) Long id) throws ResourceNotFoundException {
        if (id != null) {
            Manufacturer manufacturer = manufacturerService.findByIdIsActive(id).orElseThrow(() -> new ResourceNotFoundException("Manufacturer not found on :: " + id));
            return ResponseEntity.ok().body(manufacturer);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity saveManufacturer(@Valid @RequestBody Manufacturer manufacturer) {
        manufacturer.setIsActive((short) 1);
        return ResponseEntity.ok().body(manufacturerService.saveOrUpdate(manufacturer));
    }

    @PutMapping("/manufacturer/{id}")
    public ResponseEntity updateManufacturer(@Valid @RequestBody Manufacturer manufacturer, @PathVariable @Min(1) Long id) throws ResourceNotFoundException {

        if (id != null) {
            Manufacturer manufacturer1 = manufacturerService.findByIdIsActive(id).orElseThrow(() -> new ResourceNotFoundException("Manufacturer not found on :: " + id));
            manufacturer1 = manufacturer;
            manufacturer1.setIsActive((short) 1);
            manufacturer1.setManufacturerId(id);
            return ResponseEntity.ok().body(manufacturerService.saveOrUpdate(manufacturer1));
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/manufacturer/{id}")
    public ResponseEntity deleteById(@PathVariable @Min(1) Long id) {
        if (id != null) {
            manufacturerService.deleteByIdIsActive(id);
            return ResponseEntity.ok().body("Record deleted successfully!");
        }
        return ResponseEntity.notFound().build();
    }


}
