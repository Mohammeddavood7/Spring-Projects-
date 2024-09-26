package com.webproj.model;



import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	
	@NotNull
	@Size(min = 5,max = 15)
	private String firstName;
	
	@NotNull
	@Size(min = 5,max = 15)
	private String lastName;
	
	@NotNull
	@Size(max = 10)
	private String address;
     
}
