package com.dvd.model;

import java.util.List;

public interface EmployeeDao
{
	public void saveEmployee(Employee emp);
	public void deleteEmployee(Integer empId);
	public void updateEmployee(Employee emp);
	public Employee getEmployee(Integer empId);
	public List<Employee> getAllEmployees();
	public List<Employee> setGetEmployee(Integer id);

	
}
