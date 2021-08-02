package com.ITrator.study.practice.awt;

//a gui application using association.

import java.awt.*;
class MyFrame1
 { 
   Frame f;
   MyFrame1(String s)
   {
    f=new Frame(s);
    f.setSize(500,500);
    f.setVisible(true);
   }
  public static void main(String args[])
  {
   new MyFrame("krishna");
  }
 }
   