package com.jsp.basics;

public class Animal {
	String colour = "white";
}

class dog extends Animal {
	String colour = "black";

	void display() {
		System.out.println(super.colour);
		System.out.println(colour);

	}
}
