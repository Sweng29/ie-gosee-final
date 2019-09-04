package com.gosee.ie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @RequestMapping(value={"/","/login"},method = RequestMethod.GET)
    public ModelAndView index(){
        return new ModelAndView("/login");
    }

    @RequestMapping(value="/index", method = RequestMethod.GET)
    public ModelAndView defaultAccess(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();

        System.out.println("Hello");

        if(request.isUserInRole("ROLE_SELLER")) {
            modelAndView.setViewName("/seller/home");
        }
        else if(request.isUserInRole("ROLE_BUYER")) {
            modelAndView.setViewName("/buyer/home");
        }
        else {
            //For other pages
        }
        return modelAndView;
    }

    @RequestMapping(value= "/access-denied", method = RequestMethod.GET)
    public ModelAndView accessDenied(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/access-denied");
        return modelAndView;
    }
}
