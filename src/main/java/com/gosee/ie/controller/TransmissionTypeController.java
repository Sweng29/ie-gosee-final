package com.gosee.ie.controller;

import com.gosee.ie.exception.ResourceNotFoundException;
import com.gosee.ie.model.TransmissionType;
import com.gosee.ie.service.TransmissionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@RestController
@RequestMapping(value = "/api/transmissiontypes")
public class TransmissionTypeController {

    @Autowired
    private TransmissionTypeService transmissionTypeService;

    @GetMapping
    public ResponseEntity findAllByIsActive() {
        return ResponseEntity.ok().body(transmissionTypeService.findAllByIsActive());
    }

    @GetMapping(value = "/transmissiontype/{id}")
    public ResponseEntity<TransmissionType> findByIdAndIsActive(@PathVariable @Min(1) Long id) throws ResourceNotFoundException {
        if (id != null) {
            TransmissionType transmissionType = transmissionTypeService.findByIdIsActive(id).orElseThrow(() -> new ResourceNotFoundException("Transmission type not found on :: " + id));
            return ResponseEntity.ok().body(transmissionType);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity saveTransmissionType(@Valid @RequestBody TransmissionType transmissionType) {
        transmissionType.setIsActive((short) 1);
        return ResponseEntity.ok().body(transmissionTypeService.saveOrUpdate(transmissionType));
    }

    @PutMapping("/transmissiontype/{id}")
    public ResponseEntity updateTransmissionType(@Valid @RequestBody TransmissionType transmissionType, @PathVariable @Min(1) Long id) throws ResourceNotFoundException {

        if (id != null) {
            TransmissionType transmissionType1 = transmissionTypeService.findByIdIsActive(id).orElseThrow(() -> new ResourceNotFoundException("Transmission type not found on :: " + id));
            transmissionType1 = transmissionType;
            transmissionType1.setIsActive((short) 1);
            transmissionType1.setTransmissionTypeId(id);
            return ResponseEntity.ok().body(transmissionTypeService.saveOrUpdate(transmissionType1));
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/transmissiontype/{id}")
    public ResponseEntity deleteById(@PathVariable @Min(1) Long id) {
        if (id != null) {
            transmissionTypeService.deleteByIdIsActive(id);
            return ResponseEntity.ok().body("Record deleted successfully!");
        }
        return ResponseEntity.notFound().build();
    }
}
