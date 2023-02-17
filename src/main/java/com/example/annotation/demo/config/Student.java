package com.example.annotation.demo.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

	private String rollNo;
	private String name;
	private String age;

	public void demoStudent() {
		System.out.println("\nThis is demoStudent method in Student bean object");
	}
	
	public void demoStudentInfo() {
		System.out.println("RollNo : "+rollNo);
		System.out.println("RollNo : "+name);
		System.out.println("RollNo : "+name);
	}
}
