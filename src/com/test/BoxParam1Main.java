package com.test;

public class BoxParam1Main {
	
	public static void main(String[] args) {
		
		BoxParam1 box1 = new BoxParam1();
		BoxParam1 box2 = new BoxParam1();
		
		System.out.println(box1.vol(2, 3, 5));
		System.out.println(box2.vol(4, 5, 6));
		
		box1.setDim();
		box2.setDim();
	}

}
