package com.spring.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.spring.orms.Employee;
import com.spring.orms.EmployeeDao;
import com.spring.orms.EmployeeDaoImpl;

@Configuration
@EnableTransactionManagement
public class DataBaseConfig
{
	
	@Bean
	public DriverManagerDataSource dataSource()
	{
		DriverManagerDataSource dmd = new DriverManagerDataSource();
		dmd.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmd.setUrl("jdbc:mysql://localhost:3306/maven");
		dmd.setUsername("root");
		dmd.setPassword("Tiger@13");
		return dmd;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory()
	{
		LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
		bean.setDataSource(dataSource());
		bean.setAnnotatedClasses(Employee.class);
		Properties props = new Properties();
		props.setProperty("hibernate.show_sql", "true");
		props.setProperty("hibernate.format_sql", "true");
		bean.setHibernateProperties(props);
		return bean;
	}

	
	@Bean
	public HibernateTransactionManager transactionManager()
	{
		HibernateTransactionManager bean = new HibernateTransactionManager();
		bean.setSessionFactory(sessionFactory().getObject());
		return bean;
	}
	
	
	@Bean
	public EmployeeDao dao()
	{
		EmployeeDaoImpl bean = new EmployeeDaoImpl();
		bean.setSessionFactory(sessionFactory().getObject());
		return bean;
	}
	
	

	
	
}














