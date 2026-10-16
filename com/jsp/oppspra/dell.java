package com.jsp.oppspra;

public class dell implements Laptop {
	public void cost() {
		System.out.println("The dell lap top cost 60000");

	}

	@Override
	public void copy() {
		System.out.println("This is cpy method");

	}

	@Override
	public void past() {
		System.out.println("This is past method");

	}

	@Override
	public void cut() {
		System.out.println("This is cut method");

	}

	@Override
	public void print() {
		System.out.println("This is print method");

	}

}
