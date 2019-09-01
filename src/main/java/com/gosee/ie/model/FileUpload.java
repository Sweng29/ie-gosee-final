package com.gosee.ie.model;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "FILES")
public class FileUpload {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long fileUploadId;
    private String fileName;
    private String fileType;
    @Lob
    private byte[] data;
    private String filePath;


    public FileUpload(String fileName, String contentType, byte[] bytes,String filePath) {
        this.fileName = fileName;
        this.fileType = contentType;
        this.data = bytes;
        this.filePath = filePath;
    }

    public FileUpload(){}

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Long getFileUploadId() {
        return fileUploadId;
    }

    public void setFileUploadId(Long fileUploadId) {
        this.fileUploadId = fileUploadId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "FileUpload{" +
                "fileUploadId=" + fileUploadId +
                ", fileName='" + fileName + '\'' +
                ", fileType='" + fileType + '\'' +
                ", data=" + Arrays.toString(data) +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}
