package com.test;

public class BoxConstructOverloadMain1 {

	public static void main(String[] args) {
		
		BoxConstructOverload1 b1 = new BoxConstructOverload1();
		BoxConstructOverload1 b2 = new BoxConstructOverload1(5);
		BoxConstructOverload1 b3 = new BoxConstructOverload1(3,4,5);
		
		System.out.println(b1.volume());
		System.out.println(b2.volume());
		System.out.println(b3.volume());
	}
}
