package com.ITrator.study.collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

class FailSafe { 
    public static void main(String args[]) 
    { 
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 }); 
        
        Iterator<Integer> itr = list.iterator(); 
        while (itr.hasNext()) { 
            Integer no = (Integer)itr.next(); 
            System.out.println(no); 
            if (no == 8) 
  
                // This will not print, 
                // hence it has created separate copy 
                list.add(14); 
        } 
        System.out.println(list);
    } 
} 