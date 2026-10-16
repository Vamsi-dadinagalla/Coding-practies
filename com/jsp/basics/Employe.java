package com.jsp.basics;

public class Employe {
	int empid;
	String name;

	public Employe(int n, String s) {
		empid = n;
		name = s;
		System.out.println(empid + " " + " " + name);
	}

	public static void main(String[] args) {

		Employe e1 = new Employe(101, "vamsi");

	}
}
