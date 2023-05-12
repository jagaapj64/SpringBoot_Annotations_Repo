package com.example.annotation.demo.config;

import lombok.Data;

@Data

public class Red implements Color {

	public Red(String name) {
		this.name = name;
		System.out.println("Red color: " + name);

	}

	public Red() {
		System.out.println("Red Color Default constructor	");
	}

	private String name;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
