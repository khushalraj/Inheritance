package com.example.inheritance;



import com.example.inheritance.*;
public class B extends A {

	 static int x = 20;
	
     

	public void test()
	{
		
		
	     System.out.println(super.x);
	     System.out.println(this.x);
		System.out.println(" class B test method ");
		
	}

public static void main(String[] args) {
	B b  = new B();
	b.test();
	
    
}
}
