package com.java.Object;

public class Pencil {
String brand;
double price;
Pencil(String brand, double price) {
this.brand=brand;
this.price=price;
}
public String tostring()
{
	return "Pencil [brand="+brand+",price="+price+"]";
}
}
