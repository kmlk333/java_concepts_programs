package com.ITrator.study.practice.abstracts;

public class ChildAbstract extends MyAbstract{

	public ChildAbstract(int x)
	{
		super(x);
	}
	@Override
	void display() {
		System.out.println("Inside Child display");
		
	}

}
