package com.gosee.ie.controller;

import com.gosee.ie.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/buy-stuff")
public class BuyController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ModelAndView buyStuff()
    {
        ModelAndView modelAndView = new ModelAndView("buy-stuff");
        modelAndView.addObject("categories",categoryService.findAllParentCategoriesByIsActive());
        return modelAndView;
    }

}
