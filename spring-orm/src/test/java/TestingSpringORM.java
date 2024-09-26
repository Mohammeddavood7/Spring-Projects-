import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orms.Employee;
import com.spring.orms.EmployeeDao;

public class TestingSpringORM {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        EmployeeDao dao = ctx.getBean("daos", EmployeeDao.class); // Use EmployeeDao interface
        //Employee emp = new Employee(1001, "lalu", "khamam", 60000d);
        //dao.saveEmployee(emp);
        List<Employee> allEmployee = dao.getAllEmployee();
        for(Employee e : allEmployee)
        {
        	System.out.print(e.getEmpId()+" ");
        	System.out.print(e.getEmpName()+" ");
        	System.out.print(e.getEmpAddress()+" ");
        	System.out.println(e.getEmpSal());

        }
        System.out.println("success!!!!");
    }
}
