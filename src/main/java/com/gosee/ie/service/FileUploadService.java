package com.gosee.ie.service;

import com.gosee.ie.exception.FileNotFoundException;
import com.gosee.ie.exception.FileStorageException;
import com.gosee.ie.model.FileUpload;
import com.gosee.ie.properties.FileStorageProperties;
import com.gosee.ie.repository.FileUploadRepository;
import com.gosee.ie.util.GenericDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileUrlResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class FileUploadService implements GenericDAO<FileUpload> {

    @Autowired
    private FileUploadRepository fileUploadRepository;

    private final Path fileStorageLocation;

    @Autowired
    public FileUploadService(FileStorageProperties fileStorageProperties) {
        this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir())
                .toAbsolutePath().normalize();

        try {
            Files.createDirectories(this.fileStorageLocation);
        } catch (Exception ex) {
            throw new FileStorageException("Could not create the directory where the uploaded files will be stored.", ex);
        }
    }

    @Override
    public List<FileUpload> findAll() {
        return null;
    }

    @Override
    public Optional<FileUpload> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<FileUpload> findAllByIsActive() {
        return null;
    }

    @Override
    public Optional<FileUpload> findByIdIsActive(Long id) {
        return Optional.empty();
    }

    @Override
    public FileUpload saveOrUpdate(FileUpload entity) {
        return null;
    }

    @Override
    public Boolean deleteById(Long id) {
        return null;
    }

    @Override
    public Boolean deleteByIdIsActive(Long id) {
        return null;
    }

    public FileUpload storeFile(MultipartFile file) {
        // Normalize file name
        String fileName = file.getOriginalFilename();

        try {
            // Check if the file's name contains invalid characters
            if(fileName.contains("..")) {
                throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
            }
            fileName = UUID.randomUUID()+"."+fileName.substring(fileName.lastIndexOf('.')+1);
            FileUpload fileUpload = new FileUpload(fileName, file.getContentType(), this.fileStorageLocation.toString() + "\\" + fileName);
            fileUploadRepository.save(fileUpload);
            // Copy file to the target location (Replacing existing file with the same name)
            Path targetLocation = this.fileStorageLocation.resolve(fileName);
            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);

            return fileUpload;
        } catch (IOException ex) {
            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
        }
    }

    public FileUpload findFile(Long fileUploadId) {
        return fileUploadRepository.findById(fileUploadId)
                .orElseThrow(() -> new FileNotFoundException("File not found with id " + fileUploadId));
    }

    public Resource loadFileAsResource(String fileName) {
        try {
            System.out.println(fileName);
            Path filePath = this.fileStorageLocation.resolve(fileName).normalize();
            System.out.println(filePath);
            Resource resource = new UrlResource(filePath.toUri());
            if (resource.exists()) {
                System.out.println(resource + " found");
                return resource;
            } else {
                throw new FileNotFoundException("File not found " + fileName);
            }
        } catch (MalformedURLException ex) {
            throw new FileNotFoundException("File not found " + fileName, ex);
        }
    }

    public Resource loadResourceFileById(Long id)
    {
        Optional<FileUpload> fileUpload = fileUploadRepository.findById(id);
        if(fileUpload.isPresent())
        {
            Path filePath = this.fileStorageLocation.resolve(fileUpload.get().getFilePath()).normalize();
            System.out.println(filePath);
            try {
                Resource file = new FileUrlResource(filePath.toString());
                if(file.exists())
                {
                    return file;
                }
            } catch (MalformedURLException e) {
                throw new FileNotFoundException("File not found ", e);
            }
        }
        return null;
    }
}
