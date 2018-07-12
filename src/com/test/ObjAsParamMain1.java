package com.test;

public class ObjAsParamMain1 {

	public static void main(String[] args) {

		ObjAsParam1 box1 = new ObjAsParam1(5, 6);
		ObjAsParam1 box2 = new ObjAsParam1(5, 6);
		ObjAsParam1 box3 = new ObjAsParam1(100, 19);

		System.out.println(box1.equals(box2));
		System.out.println(box1.equals(box3));

	}

}
