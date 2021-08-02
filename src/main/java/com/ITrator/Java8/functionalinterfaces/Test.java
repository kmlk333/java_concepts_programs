package com.ITrator.Java8.functionalinterfaces;

public class Test implements I, J{

	@Override
	public void show() {
		I.super.show();
	}

	public static void main(String[] args) {
		new Test().show();
	}
}
