package com.ITrator.study.expcetion;

public class CatchWithFinally 
{
	public static void main(String...a)
	{
		try
		{
			System.out.println("Inside try");
			int i = 8/0;
			throw new NullPointerException("Null Exception");
		}
		catch(ArithmeticException e)
		{
			//Thread.sleep(2000);
			System.out.println("Inside Catch"); //When Exception occurs jvm start a new thread
		}
		finally
		{
			System.out.println("Inside Finally");
		}
	}
}
