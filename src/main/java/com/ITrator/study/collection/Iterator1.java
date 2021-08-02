package com.ITrator.study.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Iterator1 
{
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(10);
		list.add(5);
		list.add(15);
		list.add(25);
		
		Iterator<Integer> itr = list.iterator();
		//list.add(100);
		
		boolean condition = true;
		while (itr.hasNext()) {
			System.out.println(itr.next());
			if(condition) {
				condition = false;
				//list.add(100);
				itr.remove();
				System.out.println(list);
			}
		}
		System.out.println(list);
	}
}
