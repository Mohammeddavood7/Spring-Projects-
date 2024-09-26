package com.spring.orms;

import java.util.List;

public interface EmployeeDao {

	public void saveEmployee(Employee emp);
	public void updateEmployee(Integer empId);
	public void deleteEmployee(Integer empId);
	public Employee getEmployee(Integer empId);
	public List<Employee> getAllEmployee();
	

}
