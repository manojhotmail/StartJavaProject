package com.test;

public class BoxConstructor {
	
	int width;
	int height;
	int depth;
	
	//Constructor initiated
	BoxConstructor(){
		
		width = 10;
		depth = 9;
		height = 5;
	}
	
	//Method for volume
	void volume() {
		
		System.out.println(width * depth * height);
	}

}
