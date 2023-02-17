package com.example.annotation.demo.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class College2 {


	private Principal principal;

	 
	public void demoCollege() {
		System.out.println("\nThis is demoCollege method in College2 bean object");
	}
	
	public void demoCollegePrincipal() {
		principal.principalInfo();
		System.out.println("This is demoCollegePrincipalInfo method in College2 bean object ");
	}

}
