package com.ITrator.Java8.functionalinterfaces;

public interface FunctionaInterface {

	void show();
	
	default void watch() {
		System.out.println(" watching ");
	}
	
	default void printing() {
		System.out.println(" printing ");
	}
	
	static void staticMethod1() {
		System.out.println(" staticMethod1");
	}
	
	static void staticMethod2() {
		System.out.println( " staticMethod2");
	}
}
