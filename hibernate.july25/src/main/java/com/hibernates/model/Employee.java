package com.hibernates.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee 
{
	private Integer empId;
	private String empName;
	private String empAddress;
	private Double empSal;

}
