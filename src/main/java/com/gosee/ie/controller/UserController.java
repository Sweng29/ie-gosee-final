package com.gosee.ie.controller;

import com.gosee.ie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.gosee.ie.model.User;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value={"/","/login"},method = RequestMethod.GET)
    public ModelAndView index(){
        return new ModelAndView("/login");
    }

    @RequestMapping(value="/index", method = RequestMethod.GET)
    public ModelAndView defaultAccess(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();

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


    @RequestMapping(value= "/signup", method = RequestMethod.GET)
    public ModelAndView signUp() {
        ModelAndView modelAndView = new ModelAndView("signup");
        modelAndView.addObject("user",new User());
        return modelAndView;
    }

    @RequestMapping(value= "/signup", method = RequestMethod.POST)
    public String userRegisteration(@Valid User user, BindingResult bindingResult){
        userService.register(user);
        return "redirect:/";
    }


}
