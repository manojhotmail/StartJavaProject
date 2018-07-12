package com.test;

public class BoxConstructOverload2 {
	
	int width;
	int depth;
	int height;
	
	BoxConstructOverload2(){
		
		width = -1;
		depth = -1;
		height = -1;
	}
	
	BoxConstructOverload2(int w, int h, int d){
		
		width = w;
		depth = d;
		height = h;
	}
	
	BoxConstructOverload2(int len){
		
		width = depth = height = len;
	}
	
	void volume() {
		
		System.out.print("Volume " );
		
		System.out.println(width * height * depth);
	}
	
	

}
