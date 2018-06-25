package com.test;

public class BoxParam {
	
	int width;
	int depth;
	int height;
	
	int vol() {
		
		int x = width * depth * height;
		return x;
	}

	void setDim(int a, int b, int c) {
		
		System.out.println("Param addition = " + a + b + c);
	}
}
