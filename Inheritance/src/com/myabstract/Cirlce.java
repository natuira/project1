package com.myabstract;

public class Cirlce extends Shape {

	private int radius;
	
	public Cirlce() {
		// TODO Auto-generated constructor stub
		radius=10;
	}
	
	
	public Cirlce(int radius,String name) {
		super(name);
		this.radius = radius;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (3.14*radius*radius);
	}

}