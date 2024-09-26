import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.DataBaseConfig;
import com.spring.orms.Employee;
import com.spring.orms.EmployeeDao;

public class TestingSpringORM 
{
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(DataBaseConfig.class);
        EmployeeDao dao = ctx.getBean("dao", EmployeeDao.class); // Use EmployeeDao interface
        Employee emp = new Employee("lalu-04", "khamam-04", 70000d);
        dao.saveEmployee(emp);
       
        
        
        /* List<Employee> allEmployee = dao.getAllEmployee();
        for(Employee e : allEmployee)
        {
        	System.out.print(e.getEmpId()+" ");
        	System.out.print(e.getEmpName()+" ");
        	System.out.print(e.getEmpAddress()+" ");
        	System.out.println(e.getEmpSal());

        }*/
        System.out.println("success!!!!");
    }
}
