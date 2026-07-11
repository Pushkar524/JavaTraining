package com.pes.corejava.exceptions;

public class ExceptionDemo1 {
	String name = "null";
	public void myDate() {
		try {
			System.out.println("Start");
			System.out.println(name.length());
			int t=10/0;
			System.out.println("END");
		}
		catch(NullPointerException e){
			System.out.println("I can Handle: "+e);
		}
		catch(ArithmeticException e) {
			System.out.println("I can Handle: "+e);
		}
		catch(Exception e) {
			System.out.println("Error Unknown: "+e);
		}
		finally {
			System.out.println("END(Excecuted Even When Error Occured)");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo1 ex = new ExceptionDemo1();
		ex.myDate();
	}

}
