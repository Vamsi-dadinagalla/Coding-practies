package com.jsp.basics;

public class DifferentDataTypes {

	void show(int a) {
		System.out.println("Integer");
	}

	void show(double a) {
		System.out.println("Double");
	}

	public static void main(String[] args) {

		DifferentDataTypes d = new DifferentDataTypes();

		d.show(10);
		d.show(10.5);

	}
}
