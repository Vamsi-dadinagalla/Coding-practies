package com.jsp.coreandbasicspra;

import java.util.ArrayList;

public class Arraylisadd {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(100);
		al.add(200);
		al.add(300);
		System.out.println(al);

		ArrayList a2 = new ArrayList<>();
		a2.add("vamsi");
		a2.add("krishna");
		a2.add("siri");
		System.out.println(a2);
		al.addAll(a2);
		System.out.println(al);
		System.out.println(al.contains(500));
		System.out.println(al.contains(al.isEmpty()));

	}

}
