package com.spring.orms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
   
	private Integer empId;
	private String empName;
	private String empAddress;
	private Double empSal;
	

}
