package com.ITrator.study.practice.brainbench;

public class Test2 {
	public static void main(String...abc)
	{
		int count = 0;
			 rowloop : for(int row = 1; row <= 3;row++) {
			 for(int col = 1; col <= 2; col++) {
			 if(row * col % 2 == 0)
			 continue rowloop;
			 count++;
			}
		}
		 System.out.println(count);

		 int i=0;
		 int j;
		 for (j=0; j<10; ++j) { i++; }
		 System.out.println(i + " " + j);

		 int a=5,b=7;
		 int c = a+=2*3+b--;
		 System.out.println(c + " " + b);
		 

	}
}
