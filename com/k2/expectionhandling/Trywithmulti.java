package com.k2.expectionhandling;

public class Trywithmulti {

	public static void main(String[] args) {
 
		try {
			int a = 10 / 0;

			int[] arr = { 10, 20, 30 };
			System.out.println(arr[5]);

		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid array index");

		} catch (Exception e) {
			System.out.println("Some other exception occurred");
		}
	}
}
