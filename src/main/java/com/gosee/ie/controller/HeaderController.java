package com.gosee.ie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeaderController {

    @GetMapping(value = {"/", "/index", "/home"})
    public ModelAndView home() {
        return new ModelAndView("redirect:/buy-stuff");
    }

    @GetMapping(value = "/buy")
    public ModelAndView buyStuff() {
        return new ModelAndView("redirect:/buy-stuff");
    }

    public ModelAndView sellStuff() {
        return new ModelAndView("redirect:/buy-stuff");
    }

    public ModelAndView seeStuff() {
        return new ModelAndView("redirect:/buy-stuff");
    }

    public ModelAndView rentStuff() {
        return new ModelAndView("redirect:/buy-stuff");
    }

    public ModelAndView whatsOn() {
        return new ModelAndView("redirect:/buy-stuff");
    }

    public ModelAndView howDoI() {
        return new ModelAndView("redirect:/buy-stuff");
    }

    public ModelAndView profile() {
        return new ModelAndView("redirect:/buy-stuff");
    }

    public ModelAndView contactUs() {
        return new ModelAndView("redirect:/buy-stuff");
    }

    public ModelAndView logout() {
        return new ModelAndView("redirect:/buy-stuff");
    }

    public ModelAndView search() {
        return new ModelAndView("redirect:/buy-stuff");
    }

}
