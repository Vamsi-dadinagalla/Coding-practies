package com.jsp.collectoinspra;

import java.util.ArrayList;

import java.util.List;

public class Listtest1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Vamsi");
		list.add("Teja");
		list.add("hema");
		list.add("bhargav");
		list.add("rajendra");
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.add(1, "siri");
		System.out.println(list);
		System.out.println(list.contains("siri"));
		System.out.println(list.size());
	}
}