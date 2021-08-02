package com.ITrator.study.designpatterns;

public class MobileFunction 
{
	private Charger charger;
	
	
	public Charger getCharger() {
		return charger;
	}

	public void setCharger(Charger charger) {
		this.charger = charger;
	}

	public void chargeIphone() {
		charger.charge();
	}	
	
	public void play() {
		System.out.println("Playing on phone");
	}
}
