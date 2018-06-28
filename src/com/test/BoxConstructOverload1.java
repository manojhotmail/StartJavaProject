package com.test;

public class BoxConstructOverload1 {
	
	int width;
	int depth; 
	int height;
	
	BoxConstructOverload1(){
		
		width = -1;
		depth = -1;
		height = -1;
	}
	
	BoxConstructOverload1(int w, int h, int d){
		
		width = w;
		depth = d;
		height = h;
	}
	
	BoxConstructOverload1(int len){
		
		width = depth = height = len;
	}
	
	int volume() {
		
		return width*height*depth;
	}
}
