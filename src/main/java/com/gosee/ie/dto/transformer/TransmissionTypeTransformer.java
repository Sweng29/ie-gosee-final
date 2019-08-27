package com.gosee.ie.dto.transformer;

import com.gosee.ie.dto.TransmissionTypeDTO;
import com.gosee.ie.model.TransmissionType;

public class TransmissionTypeTransformer {

    public static TransmissionTypeDTO transform(TransmissionType transmissionType) {
        TransmissionTypeDTO transmissionTypeDTO = new TransmissionTypeDTO();
        if (transmissionType.getTransmissionTypeId() != null) {
            transmissionTypeDTO.setTransmissionTypeId(String.valueOf(transmissionType.getTransmissionTypeId()));
        }
        if (transmissionType.getTransmissionType() != null) {
            transmissionTypeDTO.setTransmissionType(transmissionType.getTransmissionType());
        }
        return transmissionTypeDTO;
    }

}
