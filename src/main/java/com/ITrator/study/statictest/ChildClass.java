package com.ITrator.study.practice.statictest;

public class ChildClass extends SuperClass
{
	public static void display()
	{
		System.out.println("Child displays");
	}
	
	public static void display(String name)
	{
		System.out.println("Overloaded display from child");
	}
	
	public void show()
	{
		System.out.println("Child Show");
	}
	
	public static void main(String...a)
	{
		ChildClass cc = new ChildClass();
		
		cc.display();
		cc.display("Krishna");
		cc.show();
	}
}
