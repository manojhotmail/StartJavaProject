package com.test;

public class ObjAsParam4 {

	int a;
	int b;

	ObjAsParam4(int x, int y) {

		a = x;
		b = y;
	}

	boolean trueThat(ObjAsParam4 obj) {

		if (obj.a == a && obj.b == b)
			return true;
		else
			return false;
	}

}
