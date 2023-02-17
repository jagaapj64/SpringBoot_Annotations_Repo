package com.example.annotation.demo.config;

import org.springframework.stereotype.Component;

//@Component
@Component("collegeBean")
public class College {

	public void demoComponent() {
		System.out.println("This is @Component Method ");
	}
	
	public void demoComponentScan() {
		System.out.println("This is @ComponentScan Method ");
	}
}
