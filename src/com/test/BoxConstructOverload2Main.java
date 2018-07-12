package com.test;

public class BoxConstructOverload2Main {
	
	public static void main(String[] args) {
		
		BoxConstructOverload2 box1 = new BoxConstructOverload2();
		BoxConstructOverload2 box2 = new BoxConstructOverload2(3);
		BoxConstructOverload2 box3 = new BoxConstructOverload2(4, 5, 6);
		
		box1.volume();
		box2.volume();
		box3.volume();
	}

}
