import com.dvd.model.Employee;
import com.dvd.model.EmployeeDao;
import com.dvd.model.EmployeeDaoImp;

public class HibernateTesting {


	public static void main(String[] args) 
	{
		EmployeeDao dao = new EmployeeDaoImp();
		Employee emp = new Employee(13,"murty","hyderabad",100000d);
//		dao.saveEmployee(emp);
//		dao.deleteEmployee(12);
		
//		dao.updateEmployee(emp);
//		Employee employee = dao.getEmployee(13);
//		System.out.println(employee);
		
		/*
		 * List<Employee> allEmployees = dao.getAllEmployees(); for(Employee emps :
		 * allEmployees) { System.out.print(emps.getEmpId()+" ");
		 * System.out.print(emps.getEmpName()+" ");
		 * System.out.print(emps.getEmpAddress()+" ");
		 * System.out.println(emps.getEmpSal()+" ");
		 * 
		 * }
		 */
		
		
		  dao.setGetEmployee(674).forEach(System.out::println);
	
	}
}
