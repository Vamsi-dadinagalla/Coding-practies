package com.jsp.collectoinspra;

import java.util.ArrayList;

public class Arraylistmethods {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();
		al.add(100);
		al.add(200);
		al.add(300);
		System.out.println(al);
		ArrayList<Object> al2 = new ArrayList<>();
		al2.add("Vamsi");
		al2.add("Anu");
		al2.add("Krihna");
		System.out.println(al2);
		al.addAll(al2);
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.contains(99));
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		System.out.println(al.remove(1));
		System.out.println(al);
		al.clear();
		System.out.println(al);

	}

}       
