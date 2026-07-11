package com.pes.corejava.constructor;

class MyClass {
	MyClass(){}
	MyClass(double sal){
		System.out.println("Salary is :"+sal);
	}
}
public class Employee2 extends MyClass {

	int eno;
	String ename;
	double sal;
	
	Employee2(){
		System.out.println("Default Constructor");
	}
	Employee2(int eno, String ename, double sal){
		super(sal);
		this.eno = eno;
		this.ename= ename;
	    this.sal = sal;
	    System.out.printf("Employee ID: %d\nEmployee Name: %s\nEmployee Salary: %f\n",eno,ename,sal);
	}
	public void display() {
		System.out.printf("Employee ID: %d\nEmployee Name: %s\nEmployee Salary: %f\n",eno,ename,sal);
	}
	public static void main(String[] args) {
		 Employee2 e1 = new Employee2();
		 Employee2 e2 = new Employee2(1, "Sankalp",200000.00);
		 e1.display();
		 e2.display();
		
	}

}
