package com.gosee.ie.controller;

import com.gosee.ie.dto.VehicleDetailDTO;
import com.gosee.ie.dto.transformer.VehicleDetailTransformer;
import com.gosee.ie.exception.ResourceNotFoundException;
import com.gosee.ie.model.FileUpload;
import com.gosee.ie.model.VehicleDetail;
import com.gosee.ie.service.FileUploadService;
import com.gosee.ie.service.VehicleDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(value = "/api/vehicles")
public class VehicleDetailController {
    @Autowired
    private VehicleDetailService vehicleDetailService;
    @Autowired
    private FileUploadService fileUploadService;

    //@GetMapping
    public ModelAndView vehicleDetails() {
        ModelAndView modelAndView = new ModelAndView("home");
        List<VehicleDetail> vehicleDetailList = vehicleDetailService.findAllByIsActive();
        if (vehicleDetailList != null) {
            List<VehicleDetailDTO> vehicleDetailDTOList = new ArrayList<>();
            for (VehicleDetail v : vehicleDetailList) {
                VehicleDetailDTO vehicleDetailDTO = VehicleDetailTransformer.transform(v);
                vehicleDetailDTOList.add(vehicleDetailDTO);
            }
            return modelAndView.addObject(vehicleDetailDTOList);
        }
        return modelAndView;
    }

    @GetMapping
    public ResponseEntity findAllByIsActive() {
        List<VehicleDetail> vehicleDetailList = vehicleDetailService.findAllByIsActive();
        if (vehicleDetailList != null) {
            List<VehicleDetailDTO> vehicleDetailDTOList = new ArrayList<>();
            for (VehicleDetail v : vehicleDetailList) {
                VehicleDetailDTO vehicleDetailDTO = VehicleDetailTransformer.transform(v);
                vehicleDetailDTOList.add(vehicleDetailDTO);
            }
            return ResponseEntity.ok().body(vehicleDetailDTOList);
        }
        return ResponseEntity.notFound().build();
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
    public ResponseEntity saveVehicleDetail(@Valid @ModelAttribute VehicleDetail vehicleDetail) {
        Set<FileUpload> images = new HashSet<>();
        vehicleDetail.setIsActive((short) 1);
        vehicleDetail.setFileUpload(images);
        /*        VehicleDetail v = vehicleDetailService.saveOrUpdate(vehicleDetail);*/

        if (vehicleDetail.getImageFiles() != null) {
            for (MultipartFile multipartFile : vehicleDetail.getImageFiles()) {
                FileUpload fileUpload = fileUploadService.storeFile(multipartFile);
                String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                        .path("/downloadFile/")
                        .path(fileUpload.getFileUploadId().toString())
                        .toUriString();
                images.add(fileUpload);
            }
            vehicleDetailService.saveOrUpdate(vehicleDetail);
            vehicleDetail.setImageFiles(null);
            return ResponseEntity.ok().body(vehicleDetail);
        }
        return ResponseEntity.ok().body(vehicleDetailService.saveOrUpdate(vehicleDetail));
    }

    @PutMapping("/vehicle/{id}")
    public ResponseEntity updateVehicleDetail(@Valid @RequestBody VehicleDetail vehicleDetail, @PathVariable @Min(1) Long id) throws ResourceNotFoundException {

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

    @GetMapping(value = "/category/{id}")
    public ResponseEntity findVehicleByCategoryId(@PathVariable @Min(1) Long id) {
        if (id != null) {
            List<VehicleDetail> vehicles = vehicleDetailService.findAllByCategoryId(id);
            return ResponseEntity.ok().body(vehicles);
        }
        return ResponseEntity.notFound().build();
    }

}
