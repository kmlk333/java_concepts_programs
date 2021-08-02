package com.ITrator.study.designpatterns.factory;

public class TestFactory {
	
	public static void main(String...a)
	{
		System.out.println(CarFactory.buildCar(CarType.SEDAN));
		System.out.println(CarFactory.buildCar(CarType.LUXURY));
		System.out.println(CarFactory.buildCar(CarType.SMALL));
	}
}
