package com.pes.corejava.threads;

class myClass implements Runnable{
	public void run() {
		for(int i  =0 ;i <= 100 ; i++) {
			System.out.println(i+" ");
		}
	}
}
public class ThreadDemo2 {
public static void main(String args[]) {
	myClass m1 = new myClass();
	Thread t1 = new Thread(m1);
	t1.start();
	Thread t2 = new Thread(m1);
	t2.start();
}
}
