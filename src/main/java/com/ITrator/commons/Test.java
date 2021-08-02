package com.ITrator.commons;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		
		Map<String, Integer> obj = new HashMap<String, Integer>();
		
		obj.put("A",4);
		obj.put("B",5);
		obj.put("C",1);
		
		int c = 10 + 5;
		System.out.println(" obj values are " + obj);
	}
}
