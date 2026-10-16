package com.jsp.stringpra;

public class Reversestring {

	public static void main(String[] args) {
		String s1 = "Vamsi";
		String Revers = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			Revers = Revers + s1.charAt(i);
		}
		System.out.println(Revers);
	}

}
