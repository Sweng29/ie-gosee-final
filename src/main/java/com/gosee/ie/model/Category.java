package com.gosee.ie.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "CATEGORY")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CATEGORY_ID")
    private Long categoryId;
    @NotEmpty(message = "Category name should not be empty.")
    private String name;
    @OneToOne(mappedBy = "category")
    private VehicleDetail vehicleDetail;
    @Min(1)
    private Short isActive;

    public VehicleDetail getVehicleDetail() {
        return vehicleDetail;
    }

    public void setVehicleDetail(VehicleDetail vehicleDetail) {
        this.vehicleDetail = vehicleDetail;
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
}
