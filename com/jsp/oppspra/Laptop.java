package com.jsp.oppspra;

public interface Laptop {
	public void copy();

	public void past();

	public void cut();

	public void print();

	public void cost();

	default void bootlogo() {
		System.out.println("welocome to loptop");
	}

	static void company() {
		System.out.println("This is you can put your company name");
	}
}
