package com.webproj.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee 
{
    private int empId;
    
    @NotNull
    @NotBlank
    @Size(max=45)
    private String empName;
    
  
    @NotBlank
    @Size(max=45)
    private String empAddress;
    

    @NotNull(message = "Salary cannot be null")
    @Positive
    @Max(value = 100000)
    private Double empSalary;
    
    
	public Employee(String empName, String empAddress, double empSal) {
		super();
		this.empName = empName;
		this.empAddress = empAddress;
		this.empSalary = empSal;
	}
    
    
    
    
}
