package com.example.annotation.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data

@Component
public class Customers {

	public Customers() {
		super();
		System.out.println("object is created..");
	}
	



	private int cid;
	private String cname;
	@Autowired
	private Orders orders;
	
	
	public void working() {
		System.out.println("A man is walking ");
		orders.orderProduct();
	}
	
	/*
	 * Can we use @component and @bean in same class?
	 * 
	 * @Willa yes,@Bean can be used in inside a class annotiated with @Component."You can use the @Bean annotation in a 
	 * @Configuration-annotated or in a @Component-annotated class."
	 * 
	 */
	@Bean
	public Animal eating() {
		System.out.println("Animal also walking ");
		return new Animal();
	}
	
	@Autowired
	public void setOrders(Orders orders) {
		this.orders=orders;
		
	}
}
