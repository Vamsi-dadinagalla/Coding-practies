package com.k2.expectionhandling;

public class Test {

	public static void main(String[] args) {
		System.out.println("The program will start");
		int a = 5;
		int b = 0;
		int C = 0;
 
		try {
			C = a / b;
		}

		catch (ArithmeticException e) {
			System.out.println(e);
		}

		finally {
			System.out.println("This is the finally block in this code");

		}

		System.out.println("The program will be end");
	}
}