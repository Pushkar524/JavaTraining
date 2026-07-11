package com.pes.corejava.oops;

public class Myclass extends Calculation{
	public void show() {
		System.out.println("Local methods of Myclass");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass obj = new Myclass();
		obj.addition();
		obj.show();
	}

}
