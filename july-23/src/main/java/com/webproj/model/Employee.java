package com.webproj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee 
{
    private int empId;
    private String empName;
    private String empAddress;
    private double empSal;
	public Employee(String empName, String empAddress, double empSal) {
		super();
		this.empName = empName;
		this.empAddress = empAddress;
		this.empSal = empSal;
	}
    
}
