package com.pes.corejava.static1;

public class StaticDemo2 {
	static String cname = "India";
	static public void myData() {
		System.out.println("C name:"+cname);
		
		
	}
	public void myDisplay() {
		System.out.println("Non-Static Method");
		myData();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cname);
		myData();
		StaticDemo2 sd = new StaticDemo2();
		sd.myDisplay();
	}

}
