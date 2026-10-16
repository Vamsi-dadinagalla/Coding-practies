package com.jsp.basics;

public class privatemethodoverr {

	    private void display() {
	        System.out.println("No parameter");
	    }

	    private void display(int a) {
	        System.out.println(a);
	    }

	    public static void main(String[] args) {
	    	privatemethodoverr d = new privatemethodoverr();
	        d.display();
	        d.display(10);
	    }
	}


