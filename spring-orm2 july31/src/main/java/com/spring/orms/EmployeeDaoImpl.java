package com.spring.orms;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;


public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao
{

	
	@Override
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void saveEmployee(Employee emp)
	{
		if(emp != null)
		{
		 super.getHibernateTemplate().save(emp);
		}
	}

	
	@Override
	public void updateEmployee(Integer empId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(Integer empId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getEmployee(Integer empId) {
		// TODO Auto-generated method stub
		return null;
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployee() 
	{
		
		return (List<Employee>) super.getHibernateTemplate().find("from Employee");
	}
	

	

}
