package com.ITrator.study.java8;

public interface InterfaceA {
	
	void add();
	abstract void substract();
	default void show() {
		System.out.println("A show");
	}
	default void print() {
		System.out.println("A print");
	}
	static void dispaly() {
		System.out.println("A display");
	}
	static void echo(){
		System.out.println("A echo");
	}
}
