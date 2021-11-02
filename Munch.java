package com.java.Object;

public class Munch {
	String brand;
	double price;
	Munch(String brand, double price) {
	this.brand=brand;
	this.price=price;
	}
	public String tostring()
	{
		return "Munch [brand="+brand+",price="+price+"]";
}
}