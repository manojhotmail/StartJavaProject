package com.test;

public class BoxParam2Main {

	public static void main(String[] args) {
		
		BoxParam2 box = new BoxParam2();
		
		BoxParam2 box1 = new BoxParam2();
		
		System.out.println(box.hexa(3, 4, 5));
		System.out.println(box1.hexa(2, 2, 2));
		
		
		box.setDim();
		box1.setDim();
	}

}
