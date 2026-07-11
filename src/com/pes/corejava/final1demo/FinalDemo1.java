package com.pes.corejava.final1demo;

public class FinalDemo1 {
	final String cname= "India";
	public void display() {
		System.out.println("Cname: "+cname);
	}
	public static void main(String[] args) {
		FinalDemo1 fd = new FinalDemo1();
		fd.display();

	}

}
