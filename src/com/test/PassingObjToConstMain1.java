package com.test;

public class PassingObjToConstMain1 {

	public static void main(String[] args) {

		PassingObjToConst1 obj1 = new PassingObjToConst1();

		PassingObjToConst1 obj2 = new PassingObjToConst1(3, 4, 5);

		PassingObjToConst1 obj3 = new PassingObjToConst1(5);

		PassingObjToConst1 obj4 = new PassingObjToConst1(9);

		PassingObjToConst1 obj5 = new PassingObjToConst1(obj4);
		
		obj1.volume();
		obj2.volume();
		obj3.volume();
		obj5.volume();

	}

}
