package com.ashsoft.singleton;

public class SingletonTestClass {

	public static void main(String[] args) {
		
		Printer p1 = Printer.getInstance();  //getting Printer class Object
		Printer p2 = Printer.getInstance();
		
		System.out.println(p1.hashCode()+ "----- "+p2.hashCode()); //hashcode is same
		System.out.println(p1==p2); //true
		
		System.out.println();
		
		p1.displayHello();
		p2.displayHello();
	}

}
