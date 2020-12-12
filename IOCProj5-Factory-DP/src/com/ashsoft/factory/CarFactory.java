package com.ashsoft.factory;

import com.ashsoft.comp.BudgetCar;
import com.ashsoft.comp.Icar;
import com.ashsoft.comp.LuxuryCar;
import com.ashsoft.comp.SportsCar;


public class CarFactory {
	
	static Icar car=null;
	
	//factory method which shows factory design pattern
	public static Icar getInstance(String carName) {
		if(carName.equalsIgnoreCase("sports")) {
			car= new SportsCar();
		}
		else if(carName.equalsIgnoreCase("luxury")) {
			car= new LuxuryCar();
		}
		else if(carName.equalsIgnoreCase("budget")) {
			car = new BudgetCar();
		}
		else
		{
			throw  new IllegalArgumentException();
		}
		return car;
	}
}
