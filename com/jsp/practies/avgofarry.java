package com.jsp.practies;

public class avgofarry {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 20 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}
		System.out.println("This is the sum of Arry=" + sum);
		int Avg = sum / a.length;
		System.out.println("This is Avg =" + Avg);

	}
}
