package dvd.CURD_TEST;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao extends JdbcTemplate {
  
	
	public int  insertEmployee(Employee emp)
	{ 
	   Object employee [] = {emp.getEmpId(),emp.getEmpName(),emp.getEmpAddres(),emp.getEmpSal()};
	    int update = update("insert into test values(?,?,?,?)", employee);
	    return update;
	}

}
