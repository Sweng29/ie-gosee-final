package com.gosee.ie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/rent-stuff")
public class RentStuffController {

    @GetMapping
    public ModelAndView rentStuff() {
        return new ModelAndView("rent-stuff");
    }

}
