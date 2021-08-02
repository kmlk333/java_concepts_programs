package com.ITrator.study.test;

// A simple program to read a character from keyboard
import java.io.*;
class BRRead 
 {
  public static void main(String args[]) throws IOException
   {
     char c;
     System.out.println("A simple program to read a character from keyboard");
     System.out.println();
  
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter characters, 'q' to quit.");
   do
   {
    c=(char) br.read();
    System.out.print("entered number is ");
    System.out.println(c);
   }
   while(c!= 'q' );
   }
 }