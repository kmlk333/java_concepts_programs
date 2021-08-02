package com.ITrator.study.generics;

public class GenericClass<T> implements GenericInterface<T>{

	T t;
	
	public GenericClass(T t) {
		this.t = t;
	}
	
	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}

	@Override
	public void assign(T t) {
		System.out.println("Type of object is " + t.getClass().getName());
		this.t = t;
	}

	@Override
	public T print() {
		System.out.println("Value is " + t);
		return t;
	}
}
