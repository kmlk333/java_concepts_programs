package com.ITrator.study.test;

class A
 {
  void show()
   {
    System.out.println("Hello this is A class");
   }  
 }

class B1
 {
   void display()
   {
    System.out.println("Hello this is display");
   }
 }

class C
 {
   public static void main(String args[])
  {
   A a= new A();
   B1 b= new B1();
    a.show();
    b.display();
   }
 }

