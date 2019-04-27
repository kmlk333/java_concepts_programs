package com.ITrator.study.practice.test;

//use of charAt() to print the string
class String1
 {
  public static void main(String args[])
   {
     String s=new String("krishna");
     for(int i=0;i<s.length();i++)
      {
       char ch=s.charAt(i);
	System.out.println(ch);
      }
	
    }
  }