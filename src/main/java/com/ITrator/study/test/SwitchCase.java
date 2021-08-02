package com.ITrator.study.test;

public class SwitchCase {

	public static void main(String...a)
	{
		switch(returnInt(4, 9))
		{
		case 1: System.out.println("Case 1");
			break;
		case 2: System.out.println("Case 2");
			break;
		}
	}
	
	public static int returnInt(int a, int b)
	{
		return a+b;
	}
	
	public static final int value(final int a)
	{
		return a*10/3;
	}
}
