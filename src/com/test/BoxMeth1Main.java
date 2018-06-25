package com.test;

public class BoxMeth1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box myBox = new Box();
		
		myBox.d = 3;
		myBox.h = 9;
		
		System.out.println(myBox.h - myBox.d);
		
		BoxMeth1 box = new BoxMeth1();
		box.d = 1;
		box.h = 3;
		box.w = 4;
		
		System.out.println(box.calc());
		box.add();
	}

}
