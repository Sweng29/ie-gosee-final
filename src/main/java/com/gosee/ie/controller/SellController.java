package com.gosee.ie.controller;

import com.gosee.ie.service.AdvertService;
import com.gosee.ie.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "sell-stuff")
public class SellController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private AdvertService advertService;

    @GetMapping
    public ModelAndView sellPage() {
        ModelAndView modelAndView = new ModelAndView("sell-stuff");
        modelAndView.addObject("categories", categoryService.findAllParentCategoriesByIsActive());
        modelAndView.addObject("vehiclesList", null);
        return modelAndView;
    }

}
