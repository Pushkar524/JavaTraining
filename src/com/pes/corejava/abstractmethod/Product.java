package com.pes.corejava.abstractmethod;

public abstract class Product {
	Product(){
		System.out.println("This is abstract class constructor");
	}
	abstract public void newProduct();
	public void AllProduct() {
		System.out.println("All Products List");
	}
}
