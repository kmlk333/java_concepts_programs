package com.ITrator.study.collection;

import java.util.ArrayList;

public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
 
        //Adding elements to ArrayList
 
        list.add(100);
 
        list.add(null);
 
        list.add(2000);
 
        list.add(null);
 
        list.add(null);
 
        //ArrayList having 3 null elements
 
        System.out.println(list);     //Output : [100, null, 2000, null, null]
    }
}