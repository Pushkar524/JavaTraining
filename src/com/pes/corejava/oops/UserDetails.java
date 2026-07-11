package com.pes.corejava.oops;

public class UserDetails {
	public void myUser(String uname, String password) {
		System.out.printf("User Name: %s \nPassword: %s \n",uname, password);
	}
	public void myUser(String uname, String password,String capcha) {
		System.out.printf("User Name: %s \nPassword: %s \nCapcha: %s\n",uname, password,capcha);
	}
	public int myUser(int mobile, String password) {
		System.out.printf("Mobile: %d\nPassword: %s",mobile,password);
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails user = new UserDetails();
		user.myUser("Suman", "Password");
		user.myUser("Sankalp","********","zY09io");
		user.myUser(917815044,"********");
	}

}
