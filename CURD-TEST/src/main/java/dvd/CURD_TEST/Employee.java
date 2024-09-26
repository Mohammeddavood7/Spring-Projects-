package dvd.CURD_TEST;

public class Employee 
{
	
	private int empId;
	private String empName;
	private String empAddres;
	private Double empSal;
	
	

	public Employee(int empId, String empName, String empAddres, Double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddres = empAddres;
		this.empSal = empSal;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddres=" + empAddres + ", empSal=" + empSal
				+ "]";
	}



	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public String getEmpAddres() {
		return empAddres;
	}



	public void setEmpAddres(String empAddres) {
		this.empAddres = empAddres;
	}



	public Double getEmpSal() {
		return empSal;
	}



	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}



	public Employee() {
	}
	


}
