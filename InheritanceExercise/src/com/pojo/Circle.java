package com.pojo;

public class Circle extends Shape {
	
	private int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
		radius=0;
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	public void calcArea() {
		this.setArea(3.14*radius*radius);
	}
	
	public void calcPerimeter() {
		this.setPerimeter(2*3.14*radius);
	}

}
