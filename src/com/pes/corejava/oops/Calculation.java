package com.pes.corejava.oops;

public class Calculation {
	int a =10;
	int b = 20;
	int c;
	public void addition() {
		c = a+b;
		System.out.println("Addition of a and b is:"+c);
	}
	public void multiplication() {
		c = a*b;
		System.out.println("Multiplication of a and b is:"+c);
	}
	public void subtraction() {
		c = a-b;
		System.out.println("Subtraction of a and b is:"+c);
	}
	public void division() {
		float e = a;
		float f = b;
		float d = (e)/(f);
		System.out.println("Division of a and b is:"+d);
	}
	public static void main(String args[]) {
		Calculation obj = new Calculation();//object reference = object 
		obj.addition();//calling methods of class using 
		obj.multiplication();
		obj.division();
		obj.subtraction();
		System.out.println("Hello");
		Person per = new Person();
		per.display();
	}
}
