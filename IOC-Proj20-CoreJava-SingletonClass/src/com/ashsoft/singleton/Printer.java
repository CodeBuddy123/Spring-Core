package com.ashsoft.singleton;

public class Printer {
	
	private static Printer INSTANCE;
	
	private Printer()
	{
		System.out.println("Printer Constructor");
	}
	
	public static Printer getInstance()
	{
		if(INSTANCE==null) {
			INSTANCE= new Printer();
		}
		return INSTANCE;
	}
	
	public void displayHello() {
		System.out.println("Printer.displayHello()");
	}
}
