package com.ITrator.study.test;

class Byke
{
	 void run()
	 {
		  System.out.println("Running");
		  
	 }
}
class Honda extends Byke
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