package com.test;

public class ObjAsParamMain2 {

	public static void main(String[] args) {

		ObjAsParam2 obj1 = new ObjAsParam2(4, 5, 6);
		ObjAsParam2 obj2 = new ObjAsParam2(4, 5, 6);
		ObjAsParam2 obj3 = new ObjAsParam2(4, 5, 7);

		System.out.println(obj1.equalizer(obj2));
		System.out.println(obj2.equalizer(obj3));
		System.out.println(obj2.equalizer(obj1));
	}

}
