package com.ITrator.study.generics;

import java.util.ArrayList;

public class GenericMethods {
	
	static <T1, T2> Object addObjects(T1 t1, T2 t2){
		Object obj = null;
		if(t1 instanceof String && t2 instanceof String) {
			String first = (String) t1;
			String second = (String) t2;
			obj = first.concat(second);
		}
		
		else if(t1 instanceof Integer && t2 instanceof Integer) {
			Integer first = (Integer) t1;
			Integer second = (Integer) t2;
			obj = first + second;
		}
		return obj;
	}
	
	
	public static <T1 extends Number, T2 extends Number> Object addNumber(T1 t1, T2 t2){
		Number num = 0;
		num = ((Number) t1).doubleValue() + ((Number) t2).doubleValue();
		return num;
	}
	
	public static void processElements(ArrayList<? super Integer> a)
    {
        for (Object element : a)
        {
            System.out.println(element);
        }
    }
}
