package com.ITrator.study.practice.awt;

//a gui application using association.

import java.awt.*;
class MyFrame3
 {
  Frame f;
  TextField tf;
  Button b1;
  MyFrame3(String s)
   {
    f=new Frame(s);
    tf=new TextField();
    tf.setBounds(40,40,60,30);
    f.add(tf);
    b1=new Button("OK");
    b1.setBounds(40,120,50,60);
    f.add(b1);
    f.setLayout(null);
    f.setSize(400,400);
    f.setVisible(true);
   }
  public static void main(String args[])
  {
   new MyFrame2(" ");
  }
 }
   