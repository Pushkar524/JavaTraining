package com.pes.corejava.abstractmethod;

public class ProductDemo extends Product {
	
	public void show() {
		System.out.println("Local Method");
	}
	@Override
	public void newProduct() {
		System.out.println("Overridden Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductDemo obj = new ProductDemo();
		obj.newProduct();
		obj.AllProduct();
		obj.show();

	}

}
