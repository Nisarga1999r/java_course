package com.java.Clone1;

public class DeepCopyTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
Car car=new Car();
Car copied=(Car) car.clone();
car.engine.type="disel";
System.out.println("car brand: "+car.brand);
System.out.println("car engineId: "+car.engine.modelId);
System.out.println("car engine type: "+car.engine.type);

System.out.println("copied car brand: "+copied.brand);
System.out.println("copied car engineId:"+copied.engine.modelId);
System.out.println("copied car engine type: "+copied.engine.type);
	}

}
