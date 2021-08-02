package com.ITrator.study.collection;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMap_Demo {

   public static void main (String args[]) {
	   
	  Map map = new WeakHashMap();
      map.put(new String("Maine"), "Augusta");
      
      Runnable runner = new Runnable() {
         public void run() {
            while (map.containsKey("Maine")) {
               try {
                  Thread.sleep(500);
               } catch (InterruptedException ignored) {
               }
               System.out.println("Thread waiting");
               System.gc();
            }
         }
      };
      Thread t = new Thread(runner);
      t.start();
      System.out.println("Main waiting");
      try {
         t.join();
      } catch (InterruptedException ignored) {
      }
      System.out.println(map.get("Maine"));
   }
}