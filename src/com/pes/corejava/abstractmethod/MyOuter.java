package com.pes.corejava.abstractmethod;

public class MyOuter {
	private int data = 30;
	class Inner{
		void msg() {
			System.out.println("Data is "+data);
		}
	}
	public static void main(String arg[]) {
		MyOuter obj = new MyOuter();
		MyOuter.Inner obj_inner = obj.new Inner();
		obj_inner.msg();
	}
}
