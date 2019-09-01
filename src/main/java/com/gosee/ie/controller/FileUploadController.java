package com.gosee.ie.controller;

import com.gosee.ie.model.FileUpload;
import com.gosee.ie.service.FileUploadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;
@RestController
public class FileUploadController {

    private static final Logger logger = LoggerFactory.getLogger(FileUploadController.class);

    @Autowired
    private FileUploadService fileUploadService;

    @PostMapping("/uploadFile")
    public ResponseEntity uploadFile(@RequestParam("file") MultipartFile file) {
        FileUpload fileUpload = fileUploadService.storeFile(file);
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/downloadFile/")
                .path(fileUpload.getFileUploadId().toString())
                .toUriString();

        return ResponseEntity.ok().body("File has been uploaded successfully.");
    }

    @PostMapping("/uploadMultipleFiles")
    public ResponseEntity uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
        Arrays.asList(files)
                .stream()
                .map(file -> uploadFile(file))
                .collect(Collectors.toList());

        return ResponseEntity.ok().body("Files have been uploaded successfully.");
    }

    @GetMapping("/downloadFile/{fileId}")
    public ResponseEntity downloadFile(@PathVariable String fileId) throws IOException {
        // Load file from database
        if(fileId!=null) {
            System.out.println(fileId);
            Resource fileUpload = fileUploadService.loadFileAsResource(fileId);
            return ResponseEntity.ok()
                    .contentType(MediaType.parseMediaType(fileUpload.getDescription()))
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileUpload.getFilename() + "\"")
                    .body(fileUpload.getFile().getAbsoluteFile());
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/files/{fileId}")
    public ResponseEntity downloadFile(@PathVariable Long fileId) throws IOException {
        // Load file from database
        if(fileId!=null) {
            System.out.println(fileId);
            Resource fileUpload = fileUploadService.loadResourceFileById(fileId);
/*            return ResponseEntity.ok()
                    .contentType(MediaType.parseMediaType(fileUpload.getDescription()))
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileUpload.getFilename() + "\"")
                    .body(fileUpload);*/
            return ResponseEntity.ok().body(fileUpload.getFile().getPath());
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/images/{fileId}")
    public ModelAndView findFile(@PathVariable Long fileId) throws IOException {
        // Load file from database
        if(fileId!=null) {
            Resource fileUpload = fileUploadService.loadResourceFileById(fileId);
            ModelAndView modelAndView = new ModelAndView("categories");
            return modelAndView.addObject("imagePath",fileUpload.getFile().getName());
        }
        return null;
    }

}
