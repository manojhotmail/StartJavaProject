package com.test;

public class BoxConstructOverload3 {
	
	int width;
	int depth;
	int height;
	
	BoxConstructOverload3(){
		
		width = -1;
		depth = -1;
		height = -1;
	}
	
	BoxConstructOverload3(int width, int depth, int height){
		
		this.width = width;
		this.depth = depth;
		this.height = height;
	}
	
	BoxConstructOverload3(int len){
		
		width = depth = height = len;
	}
	
	void volume() {
		
		System.out.print("Volume = " );
		System.out.println(width * depth * height);
	}

}
