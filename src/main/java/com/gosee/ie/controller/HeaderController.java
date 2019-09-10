package com.gosee.ie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeaderController {

    @GetMapping(value = {"/homepage"})
    public ModelAndView home() {
        return new ModelAndView("redirect:/home");
    }

    @GetMapping(value = "/buy")
    public ModelAndView buyStuff() {
        return new ModelAndView("redirect:/buy-stuff");
    }

    @GetMapping("/sell")
    public ModelAndView sellStuff() {
        return new ModelAndView("redirect:/sell-stuff");
    }

    @GetMapping("/see")
    public ModelAndView seeStuff() {
        return new ModelAndView("redirect:/see-stuff");
    }

    @GetMapping(value = "/rent")
    public ModelAndView rentStuff() {
        return new ModelAndView("redirect:/rent-stuff");
    }

    @GetMapping("/whats-on")
    public ModelAndView whatsOn() {
        return new ModelAndView("whats-on");
    }

    @GetMapping(value = "/how-do-i")
    public ModelAndView howDoI() {
        return new ModelAndView("how-do-i");
    }

    @GetMapping("/profile")
    public ModelAndView profile() {
        return new ModelAndView("redirect:/user-profile");
    }

    @GetMapping(value = "/contact")
    public ModelAndView contactUs() {
        return new ModelAndView("contact-us");
    }

    public ModelAndView logout() {
        return new ModelAndView("redirect:/buy-stuff");
    }

    public ModelAndView search() {
        return new ModelAndView("redirect:/buy-stuff");
    }

}
