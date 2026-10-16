package com.jsp.collectoinspra;

import java.util.HashSet;
import java.util.Set;

public class Setdiff {

	public static void main(String[] args) {
		Set<Object> s1 = new HashSet<>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(50);
		s1.add(50);
		s1.add(50);
		s1.add(null);
		s1.add(null);
		s1.add(null);
		System.out.println(s1);

	}

}
