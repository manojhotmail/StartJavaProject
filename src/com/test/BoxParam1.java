package com.test;

public class BoxParam1 {
	
	int width;
	int height;
	int depth;
	
	int vol(int w, int h, int d) {
		
		width = w;
		depth = d;
		height = h;
		
		return (w * d * h);
	}
	
	void setDim() {
		
		System.out.println(width * height * depth);
	}

}
