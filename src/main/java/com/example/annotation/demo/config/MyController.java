package com.example.annotation.demo.config;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abc/dev")
public class MyController {
	// Setter Injection
	@Resource(name = "configBlack")
	public void setColor(Color c) {
		System.out.println("Injecting setter");
		this.blackColor = c;
	}

	public Color getColor() {
		return this.blackColor;
	}

	public MyController() {
		super();
	}

	Color nred;
	Color nblack;

	// Constructor injection
	@Autowired
	public MyController(  @Qualifier("constBlack") Color b, @Qualifier("constRed") Color r) {
		this.nred = r;
		this.nblack = b;
	}

	private Color blackColor;

	// Field injection
	@Autowired
	private Color black;

	// Field injection
	@Resource(name = "configRed")
	private Color red;
	
	@Resource(name = "configShape") 
	private Shape shape;
	
	@Autowired
	private Shape shapes;

	@GetMapping(value = "/customers", produces = {"application/text"})
	@ResponseStatus(value = HttpStatus.CREATED)
	public String createCustomer() {
		System.out.println("Field injection red: " + red.getName());
		System.out.println("Field injection: black " + black.getName());
		System.out.println("Field injection: shape " + shape.getName());
		System.out.println("Field injection: shapes " + shapes.getName());
		System.out.println("Setter injection black: " + blackColor.getName());

		System.out.println("Constructor inject nred: " + nred.getName());
		System.out.println("Constructor inject nblack: " + nblack.getName());

		MyController mc = new MyController();
		mc.setColor(new Red("No injection red"));
		System.out.println("No injection : " + mc.getColor().getName());

		return "Hello";
	}
}
