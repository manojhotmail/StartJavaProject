package com.test;

public class BoxConstructOverloadMain3 {

	public static void main(String[] args) {

		BoxConstructOverload3 b1 = new BoxConstructOverload3();
		BoxConstructOverload3 b2 = new BoxConstructOverload3(3, 4, 5);
		BoxConstructOverload3 b3 = new BoxConstructOverload3(8);

		b1.volume();
		b2.volume();
		b3.volume();

	}

}
