package com.jsp.stringpra;

public class Stringbuildertest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("java");
		sb.append("programing");
		System.out.println(sb);
		sb.insert(0, "Bset");
		System.out.println(sb);
		sb.replace(0, 3, "pay");
		System.out.println(sb);
		sb.delete(0, 1);
		System.out.println(sb);
	}

}
