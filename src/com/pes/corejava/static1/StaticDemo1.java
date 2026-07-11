package com.pes.corejava.static1;

public class StaticDemo1 {
	static String cname = "India";
	static public void myData() {
		System.out.println("Country Name:"+cname);
	}
	public static void main(String args[]) {
		System.out.println(cname);
		StaticDemo1.myData();
	}
}
