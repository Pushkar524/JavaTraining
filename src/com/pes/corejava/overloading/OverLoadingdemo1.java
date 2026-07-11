package com.pes.corejava.overloading;

public class OverLoadingdemo1 {
	public void myDisplay() {
		System.out.println("Hello");
	}
	public void myDisplay(String name) {
		System.out.printf("Hello %s\n",name );
	}
	public void myDsiplay(String name, String greet) {
		System.out.printf("%s!, %s",greet, name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadingdemo1 obj = new OverLoadingdemo1();
		obj.myDisplay();
		obj.myDisplay("Class");
		obj.myDsiplay("Sankalp", "Good Morining");

	}

}
