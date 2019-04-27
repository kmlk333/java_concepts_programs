package com.ITrator.study.practice.customexception;

public class TestException {
	public static void main(String...a)
	{
		TestException te = new TestException();
		try
		{
			te.add();
		}
		catch(CustomException e)
		{
			System.out.println("Hello " + e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Hello Exception " + e.getMessage());
		}
	}
	
	public void add()throws CustomException
	{
		System.out.println("This is inside test exception");
		throw new CustomException("CustomException found");
	}
	
	public void sub()throws RuntimeException
	{
		System.out.println("This is substract exception");
		throw new ArrayIndexOutOfBoundsException();
	}
	

	
	
}
