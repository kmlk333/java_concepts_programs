package com.ITrator.study.designpatterns.factory;

public class SedanCar  extends Car {
	
	SedanCar(){
		super(CarType.SMALL);
		construct();
	}
	
	@Override
	protected void construct() {
		System.out.println("In side Small");
	}
	
}
