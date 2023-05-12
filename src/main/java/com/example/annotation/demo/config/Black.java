package com.example.annotation.demo.config;

public class Black implements Color {

	public Black(String name) {
		this.name = name;
		System.out.println("Black color: " + name);

	}

	public Black() {
		System.out.println("Black Color Default constructor	");
	}

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

}
