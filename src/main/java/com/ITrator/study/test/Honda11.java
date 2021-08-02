package com.ITrator.study.test;

class Byke1
{
	 void run()
	 {
		  System.out.println("Running");
		  
	 }
}
public class Honda11 extends Byke1
{
	 void run()
	 {
		  System.out.println("Running Safely");
	 }
	 public static void main(String args[])
	 {
		  Honda honda= new Honda();
		  honda.run();
	 }
}