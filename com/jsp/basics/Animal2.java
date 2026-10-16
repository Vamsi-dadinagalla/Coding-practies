package com.jsp.basics;

class Animal2 {

	void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal2 {

	void sound() {
		System.out.println("Dog barks");
	}

	void show() {
		super.sound();
		sound();
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.show();
	}
}
