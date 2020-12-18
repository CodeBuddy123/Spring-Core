package com.ashsoft.beans;

public class B {
	
	private A a;

	

	@Override
	public String toString() {
		return "B [a=";
	}

	public void setA(A a) {
		this.a = a;
	}
	public B() {
		System.out.println("0 Param Constructor of B");
	}
}
