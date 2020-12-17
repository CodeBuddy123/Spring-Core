package com.ashsoft.beans;

public class Student {
	private int sno;
	private String sname;
	private String sadd;
	private float avg;
	
	public Student(String sname, String sadd, float avg, int sno) {
		System.out.println("Four Param Con");
		this.sname = sname;
		this.sadd = sadd;
		this.avg = avg;
		this.sno=sno;
	}

	public Student(String sname, String sadd) {
		System.out.println("Two Param Con");
		this.sname = sname;
		this.sadd = sadd;
	}

	public Student(int sno, String sname, String sadd) {
		System.out.println("Three Param Con");
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", sadd=" + sadd + ", avg=" + avg + "]";
	}
	
	
	
}
