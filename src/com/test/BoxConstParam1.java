package com.test;

public class BoxConstParam1 {
	
	int width;
	int height;
	int depth;
	
	BoxConstParam1(int w, int d, int h){
		
		width = w;
		depth = d;
		height = h;
	}
	
	int volume() {
		
		System.out.print("volume " );
		return width * depth * height;
	}

}
