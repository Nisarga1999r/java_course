package com.java.Clone1;

public class ShallowCopyTest {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
Mobile mobile=new Mobile();
Mobile copiedmobile=(Mobile)mobile.clone();
System.out.println("FROM ORIGINAL MOBILE OBJECT..");
mobile.brand="redmi";
mobile.sim.ServiceProvider="jio";
System.out.println("mobile brand: "+mobile.brand);
System.out.println("mobile sim: "+mobile.sim.ServiceProvider);

System.out.println("FROM COPIED MOBILE OBJECT..");
System.out.println("copied mobile brand: "+copiedmobile.brand);
System.out.println("copied mobile sim: "+copiedmobile.sim.ServiceProvider);
	}

}
