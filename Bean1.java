package com.java.Encapsulation;

public class Bean1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cycle cycle=new Cycle();
cycle.setPrice(8000);
cycle.setColor("black");
cycle.setNoOfTyres(2);
System.out.println("PRICE: "+cycle.getPrice());
System.out.println("COLOR: "+cycle.getColor());
	}

}
