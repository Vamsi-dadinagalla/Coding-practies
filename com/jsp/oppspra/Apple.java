package com.jsp.oppspra;

public class Apple implements Laptop {

	@Override
	public void copy() {
		System.out.println("This is the copy method");

	}

	@Override
	public void past() {
		System.out.println("This is the past method");

	}

	@Override
	public void cut() {
		System.out.println("This is the cut method");

	}

	@Override
	public void print() {
		System.out.println("This is the print method");

	}

	@Override
	public void cost() {
		System.out.println("Cost 2 laks");

	}

}
