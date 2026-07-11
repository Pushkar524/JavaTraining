package com.pes.corejava.constructor;

public class Employee {
	int eno;
	String ename;
	double sal;
	
	Employee(){
		System.out.println("Default Constructor");
	}
	Employee(int eno, String ename, double sal){
		this.eno = eno;
		this.ename= ename;
	    this.sal = sal;
	    System.out.printf("Employee ID: %d\nEmployee Name: %s\nEmployee Salary: %f\n",eno,ename,sal);
	}
	public void display() {
		System.out.printf("Employee ID: %d\nEmployee Name: %s\nEmployee Salary: %f\n",eno,ename,sal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee e1 = new Employee();
		 Employee e2 = new Employee(1, "Sankalp",2000000.00);
		 e1.display();
		 e2.display();
		
	}

}
