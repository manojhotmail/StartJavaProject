package com.test;

public class BoxReturnMain {
	
	public static void main(String args[]) {
		
		BoxReturn box = new BoxReturn();
		
		box.width = 4;
		box.depth = 9;
		box.height = 8;
		
		double vol = box.volume();
		System.out.println(vol);
		
		box.calc();
	}

}
