package com.test;

public class ObjAsParam2 {
	
	int a;
	int b;
	int c;
	
	ObjAsParam2(int a, int b, int c){
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	boolean equalizer(ObjAsParam2 o) {
		
		if(o.a == a && o.b == b && o.c == c) return true;
		else return false;
	}

}
