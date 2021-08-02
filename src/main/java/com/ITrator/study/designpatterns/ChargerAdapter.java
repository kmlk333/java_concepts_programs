package com.ITrator.study.designpatterns;

public class ChargerAdapter implements Charger{

	MicroCharger charger = new MicroCharger();
	
	@Override
	public void charge() {
		charger.charge();
	}
	
	
}
