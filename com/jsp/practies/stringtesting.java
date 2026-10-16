package com.jsp.practies;

public class stringtesting {

	public static void main(String[] args) {
		String s1 = new String("Vamsi");
		String s2 = new String("Vamsi");
		String s3 = "Vamsi";
		String s4 = "krishna";
		String s5 = "krishna";
		System.out.println(s1 == s2);// F
		System.out.println(s2 == s3);// F
		System.out.println(s4 == s5);// T
		System.out.println(s2.equals(s2));// T

	}

}
 