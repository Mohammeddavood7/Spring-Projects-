package com.webproj.model;

import java.util.List;

public interface EmployeeINF 
{
	List<Employee> getAllEmployees();
	Employee getEmployee(Integer num);
	int InsertEmployee(Employee emp);
	int updateEmployee(Employee emp);
	int deleteEmployee(Integer num);
	List<Employee> searchEmployees(String sql);

	

}
