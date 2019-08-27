package com.gosee.ie.controller;

import com.gosee.ie.exception.ResourceNotFoundException;
import com.gosee.ie.model.VehicleDetail;
import com.gosee.ie.service.VehicleDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@RestController
@RequestMapping(value = "/api/vehicles")
public class VehicleDetailController {
    @Autowired
    private VehicleDetailService vehicleDetailService;

    @GetMapping
    public ResponseEntity findAllByIsActive() {
        return ResponseEntity.ok().body(vehicleDetailService.findAllByIsActive());
    }

    @GetMapping(value = "/vehicle/{id}")
    public ResponseEntity<VehicleDetail> findByIdAndIsActive(@PathVariable @Min(1) Long id) throws ResourceNotFoundException {
        if (id != null) {
            VehicleDetail vehicleDetail = vehicleDetailService.findByIdIsActive(id).orElseThrow(() -> new ResourceNotFoundException("Vehicle details not found on :: " + id));
            return ResponseEntity.ok().body(vehicleDetail);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity saveVehicleColor(@Valid @RequestBody VehicleDetail vehicleDetail) {
        vehicleDetail.setIsActive((short) 1);
        return ResponseEntity.ok().body(vehicleDetailService.saveOrUpdate(vehicleDetail));
    }

    @PutMapping("/vehicle/{id}")
    public ResponseEntity updateVehicleColor(@Valid @RequestBody VehicleDetail vehicleDetail, @PathVariable @Min(1) Long id) throws ResourceNotFoundException {

        if (id != null) {
            VehicleDetail vehicleDetail1 = vehicleDetailService.findByIdIsActive(id).orElseThrow(() -> new ResourceNotFoundException("Vehicle details not found on :: " + id));
            vehicleDetail1 = vehicleDetail;
            vehicleDetail1.setIsActive((short) 1);
            vehicleDetail1.setVehicleDetailId(id);
            return ResponseEntity.ok().body(vehicleDetailService.saveOrUpdate(vehicleDetail1));
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/vehicle/{id}")
    public ResponseEntity deleteById(@PathVariable @Min(1) Long id) {
        if (id != null) {
            vehicleDetailService.deleteByIdIsActive(id);
            return ResponseEntity.ok().body("Record deleted successfully!");
        }
        return ResponseEntity.notFound().build();
    }
}
