package com.webproj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webproj.model.Employee;
import com.webproj.model.EmployeeDao;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao empdao ;

	public List<Employee> getAllEmployees() {
		return empdao.getAllEmployees();
	}

	public Employee getEmployee(Integer num) {
		return empdao.getEmployee(num);
	}

	public int InsertEmployee(Employee emp) {
		return empdao.InsertEmployee(emp);
	}

	public int updateEmployee(Employee emp) {
		return empdao.updateEmployee(emp);
	}

	public int deleteEmployee(Integer num) {
		return empdao.deleteEmployee(num);
	}

	public List<Employee> searchEmployees(String search_type, String search_value) {
		String sql = "";
		String search = search_type;
		if (search.equals("NAME") || search.equalsIgnoreCase("ADDRESS")) {
			search = "NAME_ADDRESS";
		}

		switch (search) {
		case "NAME_ADDRESS": {

			sql = "select *from employee where empName like '" + search_value + "%' or "+"empAddress like '" + search_value + "%'";
		}
			break;

		case "SALARY": {

			sql = "select *from employee where empSal <= "+search_value;
		}
			break;
	}
		return empdao.searchEmployees(sql);
	}

}









