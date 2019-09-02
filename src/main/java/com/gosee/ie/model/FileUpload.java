package com.gosee.ie.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "FILES")
public class FileUpload implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "FILE_UPLOAD_ID")
    private Long fileUploadId;
    private String fileName;
    private String fileType;
    /*    @Lob
        @JsonIgnore
        private byte[] data;*/
    private String filePath;
    @JsonIgnore
    @OneToOne(mappedBy = "fileUpload")
    private Category category;
    @ManyToOne
    @JoinColumn(name = "VEHICLE_DETAIL_ID")
    private VehicleDetail vehicleDetail;


    public FileUpload(String fileName, String contentType, String filePath) {
        this.fileName = fileName;
        this.fileType = contentType;
        /*this.data = bytes;*/
        this.filePath = filePath;
    }

    public FileUpload(){}

    public VehicleDetail getVehicleDetail() {
        return vehicleDetail;
    }

    public void setVehicleDetail(VehicleDetail vehicleDetail) {
        this.vehicleDetail = vehicleDetail;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

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

/*    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }*/

    @Override
    public String toString() {
        return "FileUpload{" +
                "fileUploadId=" + fileUploadId +
                ", fileName='" + fileName + '\'' +
                ", fileType='" + fileType + '\'' +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}
