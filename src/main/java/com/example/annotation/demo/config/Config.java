package com.example.annotation.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {

	
	@Bean(name = "configRed")
	 @Primary
	public Red getRedInstance() {
	    Red red = new Red();
	    red.setName("Config red");
	    return red;
	}

	@Bean(name = "configBlack")
	public Black getBlackInstance() {
	    Black black = new Black();
	    black.setName("config Black");
	    return black;
	}

	@Bean(name = "constRed")
	public Red getConstRedInstance() {
	    Red red = new Red();
	    red.setName("Config const red");
	    return red;
	}

	@Bean(name = "constBlack")
	public Black getConstBlackInstance() {
	    Black black = new Black();
	    black.setName("config const Black");
	    return black;
	}
	
	@Bean(name = "configShape")
	@Primary
	public Triangle getTriangleInstance() {
		Triangle triangle = new Triangle();
		triangle .setName("shape config");
	    return triangle ;
	}
	
}
