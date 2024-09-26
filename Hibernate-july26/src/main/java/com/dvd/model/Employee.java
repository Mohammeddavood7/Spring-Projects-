package com.dvd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	private Integer empId;
	private String empName;
	private String empAddress;
	private Double empSal;
	public Employee(String empName, String empAddress, Double empSal) {
		super();
		this.empName = empName;
		this.empAddress = empAddress;
		this.empSal = empSal;
	}
	
	

}
