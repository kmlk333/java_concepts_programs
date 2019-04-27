package com.ITrator.study.practice.abstracts;

public abstract class MyAbstract 
{
	public int x;
	
	public MyAbstract()
	{
		
	}
	
	public MyAbstract(int x)
	{
		this.x = x;
	}
	
	abstract void display();
	
	static void show()
	{
		System.out.println("Inside show");
	}
	
	void print()
	{
		System.out.println("Inside Print" + x);
	}
}
