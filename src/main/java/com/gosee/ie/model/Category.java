package com.gosee.ie.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "CATEGORY")
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CATEGORY_ID")
    private Long categoryId;
    @NotEmpty(message = "Category name should not be empty.")
    private String name;
    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private Set<VehicleDetail> vehicleDetails;
    @ManyToOne
    @JoinColumn(name = "PARENT_CATEGORY")
    @JsonIgnore
    private Category parentCategory;
    @OneToMany(mappedBy = "parentCategory",cascade = CascadeType.ALL)
    private Set<Category> childCategories;
    @Min(1)
    private Short isActive;
    @Transient
    private MultipartFile imageFile;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FILE_UPLOAD_ID", referencedColumnName = "FILE_UPLOAD_ID")
    private FileUpload fileUpload;

    public FileUpload getFileUpload() {
        return fileUpload;
    }

    public void setFileUpload(FileUpload fileUpload) {
        this.fileUpload = fileUpload;
    }

    public MultipartFile getImageFile() {
        return imageFile;
    }

    public void setImageFile(MultipartFile imageFile) {
        this.imageFile = imageFile;
    }

    public Category getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public Set<Category> getChildCategories() {
        return childCategories;
    }

    public void setChildCategories(Set<Category> childCategories) {
        this.childCategories = childCategories;
    }

    public Set<VehicleDetail> getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(Set<VehicleDetail> vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getIsActive() {
        return isActive;
    }

    public void setIsActive(Short isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", name='" + name + '\'' +
                ", vehicleDetails=" + vehicleDetails +
                ", parentCategory=" + parentCategory +
                ", childCategories=" + childCategories +
                ", isActive=" + isActive +
                ", imageFile=" + imageFile +
                '}';
    }
}
