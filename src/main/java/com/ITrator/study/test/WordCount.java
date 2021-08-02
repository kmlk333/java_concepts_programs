package com.ITrator.study.test;

//to count the word in a string

class DemoCount
 {
    public void count(String s)
     {
      int i, in,count=1;
      char ch;
      in=s.length();
     for(i=0;i<in;i++)
       {
        ch=s.charAt(i);
        if(s.charAt(i)!=' ')
           count++;
       }
      System.out.println(count);
     }
  }
 class WordCount
  {
   public static void main(String s[])
    {
      DemoCount my=new DemoCount();
      my.count("krishna mohan");
     }
   }