package com.jsp.practies;

import java.util.Scanner;

public class Numbercheck {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scn.nextInt();
		if (num>0) {
			System.out.println("The given number is positive");
		} else if (num<0) {
			System.out.println("The given number is negative");
		} else {
			System.out.println("The given number is equal");
		}
	}
}
