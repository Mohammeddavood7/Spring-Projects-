package com.webproj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.webproj.model.Employee;
import com.webproj.service.EmployeeService;

@Controller
public class EmployeeController
{

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
	public ModelAndView insertEmployee()
	{
		Employee emp = new Employee();
		ModelAndView mv = new ModelAndView("insertEmployee","employee",emp);
	
		return mv;
	}

	@RequestMapping("/insertEmployeePage")
	public String insertEmployee(@Validated Employee employee,BindingResult result ) 
	{
		if(result.hasErrors())
		{
			return "insertEmployee";
		}
		employee.setEmpSalary(Double.valueOf(employee.getEmpSalary()));
		empService.InsertEmployee(employee);
		return "redirect:/getAllEmployees";
	}

	@RequestMapping("/deleteEmployee")
	public String deleteEmployee(HttpServletRequest req) {
		String id = req.getParameter("empId");
		empService.deleteEmployee(Integer.valueOf(id));
		return "redirect:/getAllEmployees";
	}

	@RequestMapping("/updateEmployeePage")
	public String updateEmployeePage(HttpServletRequest request) 
	{
	    String id = request.getParameter("empId");
	    String name = request.getParameter("empName");
	    String address = request.getParameter("empAddress");
	    String salary = request.getParameter("empSalary");
        Employee employee = new Employee(Integer.valueOf(id),name,address,Double.valueOf(salary));
		empService.updateEmployee(employee);
		return "redirect:/getAllEmployees";
	}

	@RequestMapping("/getEmployee")
	public ModelAndView getEmployee(HttpServletRequest req)
	{
		String id = req.getParameter("empId");
		ModelAndView mv = new ModelAndView();
		Employee employee = empService.getEmployee(Integer.valueOf(id));
		employee.setEmpId(Integer.valueOf(id));
		mv.setViewName("getEmployee");
		mv.addObject("employee", employee);
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
