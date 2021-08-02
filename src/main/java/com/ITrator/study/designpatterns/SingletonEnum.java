package com.ITrator.study.designpatterns;

public enum SingletonEnum 
{
	INSTANCE;
	
	public void print() {
		System.out.println("Printing in SingletonEnum");
	}
}
