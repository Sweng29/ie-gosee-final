package com.gosee.ie.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "TRANSMISSION_TYPE")
public class TransmissionType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transmissionTypeId;
    @NotEmpty(message = "Transmission type should not be empty.")
    private String transmissionType;
    @Min(1)
    private Short isActive;

    public Long getTransmissionTypeId() {
        return transmissionTypeId;
    }

    public void setTransmissionTypeId(Long transmissionTypeId) {
        this.transmissionTypeId = transmissionTypeId;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public Short getIsActive() {
        return isActive;
    }

    public void setIsActive(Short isActive) {
        this.isActive = isActive;
    }
}
