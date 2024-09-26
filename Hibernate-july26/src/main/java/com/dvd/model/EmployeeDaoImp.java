package com.dvd.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class EmployeeDaoImp implements EmployeeDao
{
	private static String empQuery = "from Employee";
	private static String setGetEmployee = "from Employee where empId = :empId";

  private static Session os ;
  private static Transaction tx;

	static
	{
		Configuration con = new Configuration();
		con.configure("/hibernate.cfg.xml");
		SessionFactory sessionFactory = con.buildSessionFactory();
		os = sessionFactory.openSession();
	    tx = os.beginTransaction();
	}

	
	@Override
	public void saveEmployee(Employee emp)
	{
		os.save(emp);
		tx.commit();
		System.out.println("saved successfully");
		
	}

	@Override
	public void deleteEmployee(Integer empId)
	{
		Employee employee = os.get(Employee.class, empId);
        os.delete(employee);
		tx.commit();
		System.out.println("delete successfully");


		
	}

	@Override
	public void updateEmployee(Employee employees)
	{
		os.update(employees);
		tx.commit();
		System.out.println("update successfully");
	}

	@Override
	public Employee getEmployee(Integer empId)
	{
		Employee employee = os.get(Employee.class, empId);
		tx.commit();
		System.out.println("retreived successfully");


		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() 
	{
		List<Employee> list = os.createQuery(empQuery,Employee.class).list();
		tx.commit();
		return list;
	}

	@Override
	public List<Employee> setGetEmployee(Integer id)
	{
		Query<Employee> query = os.createQuery(setGetEmployee,Employee.class);
		List<Employee> list = query.setParameter("empId",id).list();
		tx.commit();
		return list;
	}
	



}
