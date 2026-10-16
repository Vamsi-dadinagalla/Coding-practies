      package com.jsp.basics;

public class Methodoverriding {
	public void add(int a, int b) {
		System.out.println(a + b);

	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);

	}

	public void add(int a, int b, String s) {
		System.out.println(a + b + s);

	}

	public static void main(String[] args) {
		Methodoverriding m1 = new Methodoverriding();
		m1.add(13, 99);
		m1.add(1, 9, 8);
		m1.add(10, 7, "Niha");

	}
}
