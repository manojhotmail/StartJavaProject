package com.test;

public class BoxParamMain {
	
	public static void main(String args[]) {
		
		BoxParam box = new BoxParam();
		
		box.depth = 2;
		box.width = 7;
		box.height = 6;
		
		System.out.println(box.vol());
		
		box.setDim(3, 3, 3);
	}

}
