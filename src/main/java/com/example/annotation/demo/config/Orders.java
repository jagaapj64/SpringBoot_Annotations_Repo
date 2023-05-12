package com.example.annotation.demo.config;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component(value="cust")

public class Orders {

	private int oid;
	private String pname;
	
	public void orderProduct() {
		System.out.println("please sign in");
	}
}
