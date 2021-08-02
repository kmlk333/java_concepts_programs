package com.ITrator.study.generics;

public class GenericTest 
{
	public static void main(String[] args) {
		GenericClass<String> obj = new GenericClass<String>("ABC");
		GenericClass<Integer> obj2 = new GenericClass<Integer>(50);
		System.out.println(obj.getT());
		System.out.println(obj2.getT());
		
		obj.assign("Krishna");
		obj.print();
	}
}
