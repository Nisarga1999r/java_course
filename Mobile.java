package com.java.Clone1;




public class Mobile implements Cloneable{
	String brand="sony";
	Sim sim=new Sim();
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
}
