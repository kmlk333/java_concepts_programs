package com.ITrator.study.test;

// A simple program to read a line from keyboard

import java.io.*;

class BRReadLines
 {
  public static void main(String args[]) throws IOException
   {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str;
    System.out.println("Enter lines of text.");
    System.out.println("Enter 'stop' to quit.");
   do
    {
     str=br.readLine();
     System.out.println(str);
    }
    while(!str.equals("stop"));
   }
  } 
 