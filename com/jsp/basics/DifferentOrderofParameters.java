package com.jsp.basics;

public class DifferentOrderofParameters {

	public void print(int a, String b) {
		System.out.println(a + " " + b);
	}

	public void print(String b, int a) {
		System.out.println(b + " " + a);
	}

	public static void main(String[] args) {

		DifferentOrderofParameters d = new DifferentOrderofParameters();

		d.print(10, "Java");
		d.print("Spring", 20);

	}
}
