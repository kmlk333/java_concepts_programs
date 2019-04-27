package com.ITrator.study.practice.test;

class f1
{
	 int hundred(int i)
		{
			if(i<=100)
			{
			int res;
			
			res=i*hundred(i+1);
			return(res);
			}
			return i;
		}
	 
	 public static void main (String args[])
	 {
	 	f1 cal=new f1();
	 	cal.hundred(100);
	 	System.out.println(cal);
	 }
}

			