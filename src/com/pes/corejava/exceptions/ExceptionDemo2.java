package com.pes.corejava.exceptions;

public class ExceptionDemo2 {
	String name  = null;
	public void myData() throws NullPointerException{
		System.out.println("Open");
		System.out.println(name.length());
		System.out.println("End");
		
	}
	public static void main(String args[]) {
		try {
			ExceptionDemo2 obj = new ExceptionDemo2();
			obj.myData();
		}
		catch(Exception e) {
			System.out.println("I can handle: "+e);
		}
	}
}
