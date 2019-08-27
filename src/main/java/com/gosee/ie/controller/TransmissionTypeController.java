package com.gosee.ie.controller;

import com.gosee.ie.service.TransmissionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/transmissiontypes")
public class TransmissionTypeController {

    @Autowired
    private TransmissionTypeService transmissionTypeService;


}
