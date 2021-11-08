package com.java.Clone1;

public class Vegitable implements Cloneable{


String name;
double price;
public Vegitable(String name, double price) {
	this.name=name;
	this.price=price;
	
}
public Object clone() throws CloneNotSupportedException{
	return super.clone();
	
}
}