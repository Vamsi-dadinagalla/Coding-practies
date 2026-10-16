package com.jsp.coreandbasicspra;

public class Emp {
	static String compname;
	int empid;
	String empname;

	Emp(int empid, String empname, String compname) {
		this.empid = empid;
		this.empname = empname;
		this.compname = compname;

	}

	public void display() {
		System.out.println(empid + " ---" + empname + "--" + compname);

	}

	public static void main(String[] args) {
		Emp e1 = new Emp(1, "vamsi", "TCS");
		e1.display();
		Emp e2 = new Emp(10, "anu", "TCS");
		e2.display();
		Emp e3 = new Emp(30, "sree", "TCS");
		e3.display();
	}

}
