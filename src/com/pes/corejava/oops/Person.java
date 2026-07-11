package com.pes.corejava.oops;
class MyAddress extends Person{
	public void change_address(String address) {
		this.address = address;
	}
}
class MyName extends MyAddress{
	public void change_name(String name) {
		this.pname = name;
	}
}
public class Person {
	String pname = "Ramesh";
	String address = "abc";
	int phoneno = 1234567890;
	public void display() {
		System.out.println("Name : "+pname);
		System.out.println("Address : "+address);
		System.out.println("Phone no.: "+phoneno);
	}
	public static void main(String args[]) {
		MyName person = new MyName();
		person.display();
		person.change_address("Shimoga");
		person.change_name("Suresh");
		person.display();
		
	}
}
