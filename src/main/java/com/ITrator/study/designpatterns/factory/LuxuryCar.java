package com.ITrator.study.designpatterns.factory;

public class LuxuryCar  extends Car {
	
	LuxuryCar(){
		super(CarType.LUXURY);
		construct();
	}
	
	@Override
	protected void construct() {
		System.out.println("In side Luxury");
	}
	
}
