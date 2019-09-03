package com.gosee.ie.controller;

import com.gosee.ie.dto.VehicleDetailDTO;
import com.gosee.ie.dto.transformer.VehicleDetailTransformer;
import com.gosee.ie.model.VehicleDetail;
import com.gosee.ie.service.CategoryService;
import com.gosee.ie.service.VehicleDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.constraints.Min;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/buy-stuff")
public class BuyController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private VehicleDetailService vehicleDetailService;


    @GetMapping
    public ModelAndView buyStuff()
    {
        ModelAndView modelAndView = new ModelAndView("buy-stuff");
        modelAndView.addObject("categories",categoryService.findAllParentCategoriesByIsActive());
        modelAndView.addObject("vehiclesList", null);//vehicleDetailService.findAllByIsActive();
        return modelAndView;
    }

    @GetMapping(value = "/vehicles-list/{id}")
    public ModelAndView findVehiclesWithCategoryId(@PathVariable @Min(1) Long id) {
        ModelAndView modelAndView = new ModelAndView("buy-stuff");
        if (id != null) {
            List<VehicleDetail> vehicleDetailList = vehicleDetailService.findAllByCategoryId(id);
            List<VehicleDetailDTO> vehicleDetailDTOList = new ArrayList<>();
            if (vehicleDetailList != null) {
                for (VehicleDetail v : vehicleDetailList) {
                    VehicleDetailDTO vehicleDetailDTO = VehicleDetailTransformer.transform(v);
                    System.out.println(vehicleDetailDTO.toString());
                    vehicleDetailDTOList.add(vehicleDetailDTO);
                }
            }
            modelAndView.addObject("vehiclesList", vehicleDetailDTOList);
            modelAndView.addObject("categories", categoryService.findAllParentCategoriesByIsActive());
            modelAndView.addObject("selectedCategory", id);
            return modelAndView;
        } else {
            modelAndView.addObject("vehiclesList", null);
            modelAndView.addObject("categories", categoryService.findAllParentCategoriesByIsActive());
            return modelAndView;
        }
    }


}
