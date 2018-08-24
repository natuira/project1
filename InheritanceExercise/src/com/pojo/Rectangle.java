package com.pojo;

public class Rectangle extends Shape {

	private int length;
	private int breadth;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
		
		length=0;
		breadth=0;
	}

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}	
	
	public void calcArea() {
		
		this.setArea(length*breadth);
	}
	
	public void calcPerimeter() {
		this.setPerimeter(2*(length+breadth));
	}
}
