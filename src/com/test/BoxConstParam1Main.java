package com.test;

public class BoxConstParam1Main {

	public static void main(String[] args) {
		
		BoxConstParam1 box1 = new BoxConstParam1(3, 4, 5);
		
		BoxConstParam1 box2 = new BoxConstParam1(4, 6, 8);
		
		System.out.println(box1.volume());
		
		System.out.println(box2.volume());
	}
}
