package com.test;

public class BoxMethOvrldMain {
	
	public static void main(String[] args) {
		
		BoxMethOvrld box1 = new BoxMethOvrld();
		
		box1.test();
		System.out.println(box1.test(8));
		box1.test(6, 7);
		box1.test(7, 4, 2);
	}

}
