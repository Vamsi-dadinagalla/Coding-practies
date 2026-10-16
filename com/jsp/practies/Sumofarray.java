package com.jsp.practies;

import java.util.Iterator;

public class Sumofarray {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 50, };
		int sum = 0;
		for (int i = 0; i < a.length ; i++) {
			sum = sum + a[i];

		}
		System.out.println(sum);

	}

}
