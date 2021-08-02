package com.ITrator.study.practice.expcetion;

public class CatchWithFinally 
{
	public static void main(String...a)
	{
		try
		{
			System.out.println("Inside try");
			int i = 8/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Inside Catch"); //When Exception occurs jvm start a new thread
		}
		finally
		{
			System.out.println("Inside Finally");
		}
	}
}
