package com.pojo;

public class Shape {

	private String name;
	private double area;
	private double perimeter;
	
	public Shape() {
		// TODO Auto-generated constructor stub
		name="No Name";
		area=0.0d;
		perimeter=0.0d;
	}

	public Shape(String name, double area, double perimeter) {
		super();
		this.name = name;
		this.area = area;
		this.perimeter = perimeter;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Name: "+name+"\tArea: "+area+"\tPerimeter: "+perimeter);
		
	}
	
}
