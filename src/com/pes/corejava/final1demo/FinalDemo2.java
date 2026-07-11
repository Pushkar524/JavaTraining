package com.pes.corejava.final1demo;
class MySanklp{
	void demo() {
		System.out.println("My demo");
	}
}
public class FinalDemo2 extends MySanklp {
	final String cname= "India";
	final public void display() {
		System.out.println("Cname: "+cname);
	}
	public static void main(String[] args) {
		FinalDemo2 fd = new FinalDemo2();
		fd.display();

	}

}
