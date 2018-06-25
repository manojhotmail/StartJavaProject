package com.test;

public class BoxParam2 {
	
	int x;
	int y;
	int z;
	
	int hexa(int w, int h, int d) {
		
		x = w;
		y = h;
		z = d;
		
		return (w*h*d);
	}
	
	void setDim() {
		
		System.out.println(x * y * z);
	}
	
	

}
