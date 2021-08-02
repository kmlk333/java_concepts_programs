package com.ITrator.study.collection;

import java.util.PriorityQueue;

public class PriorityQueueExample2 {
	public static void main(String[] args) {
		
		PriorityQueue<String> pQueue = new PriorityQueue<String>();
		
		pQueue.offer("Java");
		pQueue.offer("Hibernate");
		pQueue.offer("Spring");
		pQueue.offer("Python");
		pQueue.offer("Junit");
		pQueue.offer("Tools");
		//pQueue.offer(null);
		
		System.out.println(pQueue);
		
		System.out.println(pQueue.poll());
		System.out.println(pQueue.poll());
		System.out.println(pQueue.poll());
		System.out.println(pQueue.poll());
		System.out.println(pQueue.poll());
		
		System.out.println(pQueue);
		
	}
}
