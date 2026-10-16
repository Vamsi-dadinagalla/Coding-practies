package com.jsp.practies;

public class Twodarray {

	public static void main(String[] args) {
		int a[][] = new int[3][4];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[0][3] = 4;

		a[1][0] = 5;
		a[1][1] = 6;
		a[1][2] = 3;
		a[1][3] = 7;

		a[2][0] = 8;
		a[2][1] = 9;
		a[2][2] = 10;
		a[2][3] = 4;

		System.out.println(a.length);
		System.out.println(a[0].length       );
	}

}
