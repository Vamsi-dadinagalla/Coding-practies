package com.k2.expectionhandling;

public class Throwexaple {

	public static void main(String[] args) {
		int age = 16;
		if (age < 18) {
			throw new ArithmeticException("Not eligible for vote");
		} else {
			System.out.println("Eligible for vote");

		}

	}
}
