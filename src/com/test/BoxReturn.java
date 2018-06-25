package com.test;

public class BoxReturn {
	
	double width;
	double height, depth;
	
	double volume() {
		
		return width * height * depth;
	}
	
	void calc() {
		
		System.out.println(width + depth);
	}

}
