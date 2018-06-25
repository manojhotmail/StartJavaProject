package com.test;

public class BoxMeth1 {
	
	int w;
	int h;
	int d;
	
	public int calc() {
		
		int vol = w*h*d;
		
		return vol;
	}
	
	public void add() {
		
		System.out.println("Addition = " + w+h+d);
	}

}
