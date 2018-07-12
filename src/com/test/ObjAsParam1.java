package com.test;

public class ObjAsParam1 {
	
	int a;
	int b;
	
	ObjAsParam1(int x, int y){
		
		a = x;
		b = y;
	}
	
	boolean equals(ObjAsParam1 o) {
		
		if(o.a == a && o.b == b) return true;
		else return false;
				
	}

}
