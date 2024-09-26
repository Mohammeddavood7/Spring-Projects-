package com.webproj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.webproj.model.EmployeeDao;


@Controller
public class EmployeeController {
    
    @Autowired
    private EmployeeDao employeeDao;
    
    @RequestMapping("/getAllEmployees")
    public ModelAndView getAllEmployees() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("getAllEmployees"); 
        mv.addObject("emp", employeeDao.getAllEmployees()); 
        return mv;
    }
}
