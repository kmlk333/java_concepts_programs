package com.ITrator.study.awt;

//a gui application using inheritance
import java.awt.*;
class MyFrame extends Frame
 {
   MyFrame(String s)
   {
    super(s);
    setSize(500,500);
    setVisible(true);
   }
  public static void main(String args[])
  {
   new MyFrame("krishna");
  }
 }
   