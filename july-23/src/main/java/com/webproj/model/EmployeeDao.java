package com.webproj.model;

import static com.webproj.constant.QueryConstant.DELETE;
import static com.webproj.constant.QueryConstant.Get_ALL;
import static com.webproj.constant.QueryConstant.Get_ONE;
import static com.webproj.constant.QueryConstant.INSERT;
import static com.webproj.constant.QueryConstant.UPDATE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao extends JdbcTemplate implements EmployeeINF {

	@Autowired
	private EmployeeRowMapper rowmapper;

	@Override
	public List<Employee> getAllEmployees() {
		return query(Get_ALL, rowmapper);
	}

	@Override
	public Employee getEmployee(Integer num) {

		List<Employee> query = query(Get_ONE, rowmapper, num);

		return query.get(0);
	}

	@Override
	public int InsertEmployee(Employee emp) {
		return update(INSERT, new Object[] { emp.getEmpName(), emp.getEmpAddress(), emp.getEmpSal() });

	}

	@Override
	public int updateEmployee(Employee emp) {
		return update(UPDATE, new Object[] { emp.getEmpName(), emp.getEmpAddress(), emp.getEmpSal(), emp.getEmpId() });

	}

	@Override
	public int deleteEmployee(Integer num) {
		return update(DELETE, num);
	}
    @Override
	public List<Employee> searchEmployees(String sql)
	{
		return 	query(sql,rowmapper);
	}


}
















