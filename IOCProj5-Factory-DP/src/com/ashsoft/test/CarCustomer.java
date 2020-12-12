package com.ashsoft.test;

import com.ashsoft.comp.Icar;
import com.ashsoft.factory.CarFactory;

public class CarCustomer {
	public static void main(String[] args) {
		
		Icar car = CarFactory.getInstance("luxury");
		System.out.println(car.getClass());
		car.addAccessories();
		car.drive();
	}
}
