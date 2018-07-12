package com.test;

public class PassingObjToConst1 {

	int depth;
	int height;
	int width;

	PassingObjToConst1(PassingObjToConst1 ob) {

		depth = ob.depth;
		height = ob.height;
		width = ob.width;
	}

	PassingObjToConst1() {

		depth = -1;
		height = -1;
		width = -1;
	}

	PassingObjToConst1(int width, int depth, int height) {

		this.width = width;
		this.depth = depth;
		this.height = height;
	}

	PassingObjToConst1(int len) {

		depth = height = width = len;
	}

	void volume() {

		System.out.print("Volume = ");
		System.out.println(depth * height * width);
	}
}
