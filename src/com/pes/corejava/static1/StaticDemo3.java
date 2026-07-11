package com.pes.corejava.static1;

public class StaticDemo3 {
	static String cname= "Unchanged";
	static public void display() {
		System.out.println("This is static method");
	}
	static {
		System.out.println("This is Static Block calling static method");
		display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			cname = "Changed";
			System.out.println("cname: "+cname);
	}

}
