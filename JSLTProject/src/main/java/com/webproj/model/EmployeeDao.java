package com.webproj.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


public class EmployeeDao extends JdbcTemplate implements EmployeeINF
{
	
	@Autowired
	private EmployeeRowMapper rowmapper;

	@Override
	public List<Employee> getAllEmployees() {
		return query("select *from employee",rowmapper);
	}

}
