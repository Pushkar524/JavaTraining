package com.pes.corejava.threads;

class MyClass extends Thread{
	public void run() {
		for(int i  =0 ;i <= 100 ; i++) {
			System.out.println(i+" ");
		}
	}
}
public class ThreadDemo1 {
public static void main(String args[]) {
	MyClass t1 = new MyClass();
	t1.start();
	MyClass t2 = new MyClass();
	t2.start();
}
}
