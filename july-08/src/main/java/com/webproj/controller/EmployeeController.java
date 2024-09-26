package com.webproj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.webproj.model.Employee;
import com.webproj.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@RequestMapping("/getAllEmployees")
	public ModelAndView getAllEmployees() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("getAllEmployees");
		mv.addObject("emp", empService.getAllEmployees());
		return mv;
	}

	@RequestMapping("/insertEmployee")
	public ModelAndView insertEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("insertEmployee");
		return mv;
	}

	@RequestMapping("/insertEmployeePage")
	public String insertEmployee(HttpServletRequest req) {
		String name = req.getParameter("empName");
		String address = req.getParameter("empAddress");
		String salary = req.getParameter("empSalary");
		Employee emp = new Employee(name, address, Double.valueOf(salary));
		empService.InsertEmployee(emp);
		return "redirect:/getAllEmployees";
	}

	@RequestMapping("/deleteEmployee")
	public String deleteEmployee(HttpServletRequest req) {
		String id = req.getParameter("empId");
		empService.deleteEmployee(Integer.valueOf(id));
		return "redirect:/getAllEmployees";
	}

	@RequestMapping("/updateEmployeePage")
	public String updateEmployeePage(HttpServletRequest req) {

		String id = req.getParameter("empId");
		String name = req.getParameter("empName");
		String address = req.getParameter("empAddress");
		String salary = req.getParameter("empSalary");
		com.webproj.model.Employee emp = new Employee(Integer.valueOf(id), name, address, Double.valueOf(salary));
		empService.updateEmployee(emp);
		return "redirect:/getAllEmployees";
	}

	@RequestMapping("/getEmployee")
	public ModelAndView getEmployee(HttpServletRequest req) {
		String id = req.getParameter("empId");
		com.webproj.model.Employee emps = empService.getEmployee(Integer.valueOf(id));
		ModelAndView mv = new ModelAndView();
		mv.setViewName("getEmployee");
		mv.addObject("emp", emps);
		return mv;
	}

	@RequestMapping("/searchEmployees")
	public ModelAndView searchEmployees(HttpServletRequest req) {
		String search_type = req.getParameter("search_type");
		String search_value = req.getParameter("search_value");
		List<Employee> searchEmployees = empService.searchEmployees(search_type, search_value);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("getAllEmployees");
		mv.addObject("emp",searchEmployees);
		return mv;

	}

}
