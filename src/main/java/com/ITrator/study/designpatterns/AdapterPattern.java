package com.ITrator.study.designpatterns;

public class AdapterPattern 
{
	public static void main(String[] args) {
		
		MobileFunction function = new MobileFunction();
		function.play();
		function.setCharger(new ChargerAdapter());
		function.chargeIphone();
	}
}
