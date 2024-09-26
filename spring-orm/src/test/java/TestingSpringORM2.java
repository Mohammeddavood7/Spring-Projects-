import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orms.Employee;
import com.spring.orms.EmployeeDaoImpl;

public class TestingSpringORM2 
{
	

	public TestingSpringORM2() 
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDaoImpl bean = ctx.getBean("dao",EmployeeDaoImpl.class);
		Employee emp = new Employee(1001,"lalu","khamam",60000d);
		bean.saveEmployee(emp);
		System.out.println("success!!!!");
		
	}

}
