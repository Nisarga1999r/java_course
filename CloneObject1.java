package com.java.Clone1;

import com.java.clone.Vegitable;

public class CloneObject1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Vegitable carrot=new Vegitable("CARROT",20.00);
		Vegitable copiedcarrot=(Vegitable)carrot.clone();
		System.out.println(copiedcarrot.name);
		System.out.println(copiedcarrot.price);
	}

}
