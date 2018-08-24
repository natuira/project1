package com.myabstract;

abstract public class Shape {
	
	private String name; 
	public Shape() {
		// TODO Auto-generated constructor stub
		
		name="No name";
	}
	
	public void description() {
		System.out.println("Name: "+name);
	}
	
	

	public Shape(String name) {
		super();
		this.name = name;
	}





	abstract public double area();


}
