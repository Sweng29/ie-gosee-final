package com.gosee.ie.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Set;

@Entity
@Table(name = "body_types")
public class BodyType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BODY_TYPE_ID")
    private Long bodyTypeId;
    private String name;
    @OneToMany(mappedBy = "bodyType")
    @JsonIgnore
    private Set<VehicleDetail> vehicleDetails;
    @Max(1)
    @Min(0)
    private Short isActive;

    public Set<VehicleDetail> getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(Set<VehicleDetail> vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }

    public Long getBodyTypeId() {
        return bodyTypeId;
    }

    public void setBodyTypeId(Long bodyTypeId) {
        this.bodyTypeId = bodyTypeId;
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
