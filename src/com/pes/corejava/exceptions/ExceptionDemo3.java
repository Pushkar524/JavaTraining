package com.pes.corejava.exceptions;

class InvalidAgeException extends Exception{
	InvalidAgeException(String message){
		super(message);
	}
}

public class ExceptionDemo3 {
	public static void main(String arg[]){
		int age =16;
		try {
			if(age < 18) {
				throw new InvalidAgeException("Age Must be 18 and above");
			}
			System.out.println("Eligible to Vote");
		}
		catch(InvalidAgeException e) {
			System.out.println("I can Handle: "+e);
		}
	}
		
}
