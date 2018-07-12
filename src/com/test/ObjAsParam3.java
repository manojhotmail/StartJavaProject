package com.test;

public class ObjAsParam3 {

	int a;
	int b;

	ObjAsParam3(int x, int y) {
		
		 a = x;
		 b = y;
	}
	
	boolean equa(ObjAsParam3 o) {
		
		if(o.a == a && o.b == b) return true;
		else return false;
	}

}
