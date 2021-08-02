package com.ITrator.Java8.functionalinterfaces;

public interface I 
{
	default void show() {
		System.out.println(" I's show method");
	}
}
