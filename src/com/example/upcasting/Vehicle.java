	package com.example.upcasting;

public class Vehicle extends Car{

	int x = 20;
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("vehicle started");
	}
	
	public static void main(String[] args) {
//		Car c = new Vehicle();
//		c.start();
//		Car c1 = new Car();
//		Vehicle v = new Vehicle();
//		Car c2 = v;
//		System.out.println(c2.x);
//		c2.start();
		Car c = new Vehicle();
		Vehicle v1 = (Vehicle) c;
		System.out.println(v1.x);
		
		Car c1 = new Car();
		c1.start();
		Car c2 = new Vehicle();
		c2.start();
		
	}
}
