package dvd.CURD_TEST;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
  
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("test.xml");
		EmployeeDao emp = (EmployeeDao) ctx.getBean("dao");
		Employee insert = new Employee(111,"smith","chicago",1200.0);
		emp.insertEmployee(insert);
		System.out.println("inserted successfully");
	}

}
