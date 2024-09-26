package com.spring.orms;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity	
public class Employee 
{
	
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
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








