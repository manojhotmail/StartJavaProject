package com.test;

public class ObjAsParamMain4 {

	public static void main(String[] args) {

		ObjAsParam4 box1 = new ObjAsParam4(4, 5);
		ObjAsParam4 box2 = new ObjAsParam4(4, 5);
		ObjAsParam4 box3 = new ObjAsParam4(5, 4);

		System.out.println(box1.trueThat(box2));
		System.out.println(box2.trueThat(box3));
	}
}
