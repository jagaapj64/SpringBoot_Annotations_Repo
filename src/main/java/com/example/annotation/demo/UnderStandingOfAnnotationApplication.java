package com.example.annotation.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.example.annotation.demo.config.College2;
import com.example.annotation.demo.config.CollegeConfiguration;
import com.example.annotation.demo.config.Student;

@SpringBootApplication
@PropertySource("classpath:env.properties")
public class UnderStandingOfAnnotationApplication {

	public static void main(String[] args) {
//		SpringApplication.run(UnderStandingOfAnnotationApplication.class, args);
		
		// @Component
//		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
//		context.scan("com.example.annotation.demo");
//		context.refresh();
//		College componentDemo=context.getBean(College.class);
//		componentDemo.demoComponent();
//		context.close();
		
//		@ComponentScan("com.example.annotation.demo")
//		AnnotationConfigApplicationContext contextScan=new AnnotationConfigApplicationContext(CollegeConfig.class);
//		College collegeConfig= contextScan.getBean("collegeBean", College.class);
//		collegeConfig.demoComponentScan();
//		contextScan.close();
		
//		@Configuration
		
		
		  AnnotationConfigApplicationContext contextScan=new
		  AnnotationConfigApplicationContext(CollegeConfiguration.class); 
		  College2 collegeConfig= contextScan.getBean("yourCollegeBean", College2.class);
		  collegeConfig.demoCollege();
		  
		  
		  Student studentConfig= contextScan.getBean("studentBean", Student.class);
		  studentConfig.demoStudent();
		  
		  College2 collegeConfigConstructorInject=
		  contextScan.getBean("myCollegePrincipalInfo", College2.class);
		  collegeConfigConstructorInject.demoCollegePrincipal();
		  
		  contextScan.close();
		 
		 
		
		
	}

}
