package com.jsp.oppspra;

public class Student {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;

	}

	void diplay() {
		System.out.println("Student ID   : " + id);
		System.out.println("Student Name : " + name);

	}

	public static void main(String[] args) {
		Student s = new Student(1, "anu");
		s.diplay();

	}
}
