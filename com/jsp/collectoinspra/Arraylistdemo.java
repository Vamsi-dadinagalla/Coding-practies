package com.jsp.collectoinspra;

import java.util.ArrayList;

public class Arraylistdemo {

	public static void main(String[] args) {
		ArrayList<Object> al1mixedList = new ArrayList<>();
		al1mixedList.add(10);
		al1mixedList.add(20);
		al1mixedList.add(30);
		al1mixedList.add(40);
		al1mixedList.add(50);
		al1mixedList.add(50);
		al1mixedList.add("vamsi");
		System.out.println(al1mixedList);

		ArrayList<Object> al2mixedList = new ArrayList<>();
		al2mixedList.add(11);
		al2mixedList.add(22);
		al2mixedList.add(33);
		al2mixedList.add(44);
		al2mixedList.add(55);
		al2mixedList.add(66);
		al2mixedList.add("vamsi");
		System.out.println(al2mixedList);

		al1mixedList.addAll(al2mixedList);
		System.out.println(" the combine list of two arrys" + al1mixedList);
		al2mixedList.remove(0);
		System.out.println(al2mixedList);
		al1mixedList.removeAll(al2mixedList);
		System.out.println(al1mixedList);

	}

}
