package com.calc;

public class Calculator {
	
	private int num1;
	private int num2;
	private String op;
	private double result;
	
	public Calculator() {
		// TODO Auto-generated constructor stub
		
		num1=0;
		num2=0;
		op=null;
		result=0;
	}

	public Calculator(int num1, int num2, String op, double result) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
		this.result = result;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	public void calculations() {
		
	}
	

}
