package com.gosee.ie.dto;

import javax.validation.constraints.NotEmpty;

public class TransmissionTypeDTO {

    private String transmissionTypeId;
    @NotEmpty(message = "Transmission type should not be empty.")
    private String transmissionType;

    public String getTransmissionTypeId() {
        return transmissionTypeId;
    }

    public void setTransmissionTypeId(String transmissionTypeId) {
        this.transmissionTypeId = transmissionTypeId;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }
}
