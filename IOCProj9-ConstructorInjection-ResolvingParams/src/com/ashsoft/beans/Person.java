package com.ashsoft.beans;

public class Person {
	
	private String pname;
	private long phone;
	private int pid;
	
	
	public Person(String pname, long phone, int pid) {
		super();
		this.pname = pname;
		this.phone = phone;
		this.pid = pid;
	}


	@Override
	public String toString() {
		return "Person [pname=" + pname + ", phone=" + phone + ", pid=" + pid + "]";
	}
}
