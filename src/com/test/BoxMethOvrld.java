package com.test;

public class BoxMethOvrld {
	
	void test() {
		
		System.out.println("No param");
	}
	
	void test(int a, int b) {
		
		System.out.println(a * b);
	}
	
	void test(int x, int y, int z) {
		
		System.out.println("Three parameters " + (x + y + z));
	}
	
	double test(int j) {
		
		return j;
	}

}
