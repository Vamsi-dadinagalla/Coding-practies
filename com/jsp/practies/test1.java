package com.jsp.practies;

public class test1 {

	public static void main(String[] args) {
		int a = 0, b = 1, c;

		for (int i = 1; i <= 10; i++) {
			c = a + b; // calculate next term
			a = b; // shift values
			b = c; // update b

			System.out.print(c + " "); // print inside loop
		}
	}

}
