package com.ITrator.study.brainbench;

public class Test1
{
	public static void main(String...ag)
	{

		int a=3;
		int b=0;
		switch(a)
		{
		case 1:
		b=a+2;
		case 2:
		b=a+3;
		case 3:
		b=a+4;
		case 4:
		b=a+5;
		case 5:
		b=a+6;
		default:
		b=a*2;
	}
	//System.out.println(b);
	
	int[] arr = new int[5];
	String[] strarr = {"asdf", "asdfddddd"};
 	//System.out.println(arr.length);
 	//System.out.println(strarr);
 	
 	int[] Array1={3,6,2,9,5,8};
 	int[] Array2=Array1;
 	int[] Array3=Array2;
 	Array1[2]=2;
 	Array2[3]=5;
 	Array3[4]=7;
 	Array2[4]=Array3[4];
 	System.out.println(Array2[4]);
 	
 	int A$B = 0;
 	
 		int [] scores = {2,4,5,5,6,8};
 	 int sum = 0;
 	 for(int x : scores) 
 	 {
 	 sum += x;
 	 }
 	 System.out.println("sum is  " + sum);
	}
}