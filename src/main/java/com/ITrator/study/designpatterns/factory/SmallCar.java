package com.ITrator.study.designpatterns.factory;

public class SmallCar  extends Car {
	
	SmallCar(){
		super(CarType.SEDAN);
		construct();
	}
	
	@Override
	protected void construct() {
		System.out.println("In side Sedan");
	}
	
}
