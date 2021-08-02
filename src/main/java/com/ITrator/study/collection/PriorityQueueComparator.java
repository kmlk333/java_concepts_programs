package com.ITrator.study.collection;

import java.util.PriorityQueue;

public class PriorityQueueComparator {
	
	public static void main(String[] args) {
		PriorityQueue<Employee> empQueue = new PriorityQueue<>(7, new MyComparator());
		
		empQueue.offer(new Employee("AAA", 15000));
		empQueue.offer(new Employee("BBB", 12000));
		empQueue.offer(new Employee("CCC", 25000));
		empQueue.offer(new Employee("DDD", 7000));
		empQueue.offer(new Employee("EEE", 20000));
		
		System.out.println(empQueue);
		
		System.out.println(empQueue.poll());
		System.out.println(empQueue.poll());
		System.out.println(empQueue.poll());
		System.out.println(empQueue.poll());
		System.out.println(empQueue.poll());
	}
}
