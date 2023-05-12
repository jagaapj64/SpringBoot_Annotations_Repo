package com.example.annotation.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CollegeConfiguration {

	@Value("${student.roll.no}")
	private String rollNo;

	@Value("${student.name}")
	private String name;
//	
//	@Value("${ihi.topic.id}")
//	private String topicid;

	@Value("${student.age}")
	private String age;

	/*
	 * Note: Whenever you are using the @Bean annotation to create the bean you
	 * don’t need to use the @ComponentScan annotation inside your configuration
	 * class.
	 */
	@Bean(name = { "myCollegeBean", "yourCollegeBean" })
	College2 collegeBean() {
		return new College2();

	}

	@Bean
	Principal principalBean() {
		return new Principal();

	}

	@Bean(name = "myCollegePrincipalInfo")
	College2 collegeBeanPrincipalInfo() {

		// Constructor Injection
		// return new College2(principalBean());

		// Setter Injection
		College2 college = new College2();
		college.setPrincipal(principalBean());
		return college;

	}

	@Bean
	Product productBean() {
		return new Product();

	}

	@Bean
	Student studentBean() {
		return new Student();

	}

	@Bean(name = "studentInfoBean")
	Student studentBeanInfo() {
		return new Student(rollNo, name, age);

	}

}
