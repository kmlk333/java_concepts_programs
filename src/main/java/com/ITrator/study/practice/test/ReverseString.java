package com.ITrator.study.practice.test;

public class ReverseString 
{
	private static String rev = "";
	private static int i=0;
	public static void main(String ...a)
	{
        System.out.println("Integer Max Value: "+Short.MAX_VALUE);
        System.out.println("Integer Min Value: "+Short.MIN_VALUE);
        
		System.out.println(reverse("Krishna"));
	}
	
	private static String reverse(String str)
	{
		System.out.println("recursion........");
		if(str.length() > 0)
		rev = rev + str.charAt(str.length()-1) + reverse(str.substring(0, str.length()-1)); 
		return rev;
		

	}
}
