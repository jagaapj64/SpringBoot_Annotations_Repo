package com.example.annotation.demo.config;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Triangle implements Shape {

	private String name;

	@Override
	public String getName() {
		return name;
	}

	public Triangle(String name) {
		System.out.println("shape constructor ");
		this.name = name;
	}

	public Triangle() {

	}

}
