package com.webproj.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.webproj.model.Student;

@Controller
public class StudentController 
{
	
	
	@RequestMapping("/openLoginForm")
	public ModelAndView openLoginForm()
	{
		ModelAndView mv = new ModelAndView("openLoginForm");
		Student stud = new Student("smith", "smith", "smith");
		mv.addObject("student", stud);
		return mv;

	}

	  @RequestMapping(value = "/viewStudentDetails")
	    public ModelAndView viewStudentDetails(@Valid Student student, BindingResult result) {
	        if (result.hasErrors()) {
	            return new ModelAndView("openLoginForm");
	        }
	        return new ModelAndView("viewStudentDetails", "student", student);
	    }


}






























