package com.pes.corejava.interfacedemo;

public class BookImpl implements Book,NewBookDepo{
	public void bookTitle() {
		System.out.println("JAVA");
	};
	public void bookAuthor() {
		System.out.println("Renziel Fernandez");
	};
	public void bookPrice() {
		System.out.println("Rs. 67");
	};
	public void show() {
		System.out.println("Local Method");
	}
	public void newBook() {
		System.out.println("New Book Sankalp Depo");
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookImpl book = new BookImpl();
		book.bookAuthor();
		book.bookPrice();
		book.bookTitle();
		book.show();
		book.newBook();
		System.out.println("Book depo : "+bookDepo);
	}

}
