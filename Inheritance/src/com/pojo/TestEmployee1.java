package com.pojo;

import java.util.Scanner;

public class TestEmployee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		String name = sc.next();
		
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter EmpId: ");
		int eid = sc.nextInt();
		
		System.out.println("Enter Salary: ");
		double sal = sc.nextDouble();
		
		Employee e = new Employee(sal, eid, age, name);
		
		e.display();*/
		Person p1 = new Person(12,"ABC");
		Person p2 = new Person(12,"ABC");
		
		System.out.println(p1.getClass());
		if(p1.equals(p2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}

	}

}
