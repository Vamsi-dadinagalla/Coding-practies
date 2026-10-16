package com.jsp.basics;

public class MethodVdisplay {

	void display() {
		System.out.println("No Parameters");
	}

	void display(int a) {
		System.out.println(a);
	}

	void display(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {

		MethodVdisplay d = new MethodVdisplay();

		d.display();
		d.display(10);
		d.display(10, 20);

	}
}
