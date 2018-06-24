package com.test;

public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box myBox = new Box();
		Box myBox1 = new Box();
		
		int x = myBox.w = 10;
		int y = myBox.d = 5;
		int z = myBox.h = 2;
		
		myBox1.w = 2;
		myBox1.h = 5;
		
		System.out.println("Vol = " + x*y*z );
		System.out.println(myBox1.w * myBox1.h);

	}

}
