package com.gosee.ie.dto.transformer;

import com.gosee.ie.dto.FileUploadDTO;
import com.gosee.ie.model.FileUpload;

public class FileUploadTransformer {

    public static FileUploadDTO transform(FileUpload fileUpload) {
        FileUploadDTO fileUploadDTO = new FileUploadDTO();

        if (fileUpload.getFileUploadId() != null) {
            fileUploadDTO.setFileUploadId(String.valueOf(fileUpload.getFileUploadId()));
        }
        if (fileUpload.getFilePath() != null) {
            fileUploadDTO.setFilePath(fileUpload.getFilePath());
        }
        if (fileUpload.getFileName() != null) {
            fileUploadDTO.setFileName(fileUpload.getFileName());
        }
        return fileUploadDTO;
    }

}
