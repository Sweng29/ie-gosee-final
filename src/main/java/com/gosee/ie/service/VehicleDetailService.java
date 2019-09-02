package com.gosee.ie.service;

import com.gosee.ie.exception.FileStorageException;
import com.gosee.ie.model.VehicleDetail;
import com.gosee.ie.properties.FileStorageProperties;
import com.gosee.ie.repository.VehicleDetailRepository;
import com.gosee.ie.util.GenericDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class VehicleDetailService implements GenericDAO<VehicleDetail> {

    private final Path fileStorageLocation;
    @Autowired
    private VehicleDetailRepository vehicleDetailRepository;

    @Autowired
    public VehicleDetailService(FileStorageProperties fileStorageProperties) {
        this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir())
                .toAbsolutePath().normalize();

        try {
            Files.createDirectories(this.fileStorageLocation);
        } catch (Exception ex) {
            throw new FileStorageException("Could not create the directory where the uploaded files will be stored.", ex);
        }
    }

    @Override
    public List<VehicleDetail> findAll() {
        return vehicleDetailRepository.findAll();
    }

    @Override
    public Optional<VehicleDetail> findById(Long id) {
        return vehicleDetailRepository.findById(id);
    }

    @Override
    public List<VehicleDetail> findAllByIsActive() {
        return vehicleDetailRepository.findAllByIsActive();
    }

    @Override
    public Optional<VehicleDetail> findByIdIsActive(Long id) {
        return vehicleDetailRepository.findByIsActive(id);
    }

    @Override
    public VehicleDetail saveOrUpdate(VehicleDetail entity) {

        // Normalize file name
        String[] fileNames = new String[entity.getImageFiles().length];
        MultipartFile[] multipartFiles = entity.getImageFiles();
        try {
            // Check if the file's name contains invalid characters
            int i = 0;
            for (String fileName : fileNames) {
                if (fileName.contains("..")) {
                    throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
                }
                fileName = UUID.randomUUID() + "." + fileName.substring(fileName.lastIndexOf('.') + 1);
                Path targetLocation = this.fileStorageLocation.resolve(fileName);
                Files.copy(multipartFiles[i].getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
                i++;
            }


            /*FileUpload fileUpload = new FileUpload(fileName, file.getContentType(), this.fileStorageLocation.toString() + "\\" + fileName);
            fileUploadRepository.save(fileUpload);*/
            // Copy file to the target location (Replacing existing file with the same name)

        } catch (IOException ex) {
            throw new FileStorageException("Could not store files Please try again!", ex);
        }

        return vehicleDetailRepository.save(entity);
    }

    @Override
    public Boolean deleteById(Long id) {
        vehicleDetailRepository.deleteById(id);
        return true;
    }

    @Override
    public Boolean deleteByIdIsActive(Long id) {
        vehicleDetailRepository.deleteByIsActive(id);
        return true;
    }

    public List<VehicleDetail> findAllByCategoryId(Long categoryId) {
        return vehicleDetailRepository.findAllByCategoryId(categoryId);
    }
}
