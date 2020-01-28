package com.durga;

interface I {
	public void m1();
}

class A implements I {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}
}

public class LambdaDemo {
	public static void main(String[] args) {
//		I i=new A();
//		i.m1();
		
		I i=()->System.out.println("m1");
		i.m1();

	}

}
