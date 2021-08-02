package com.ITrator.study.collection;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		
		pQueue.offer(10);
		pQueue.offer(25);
		pQueue.offer(5);
		pQueue.offer(15);
		pQueue.offer(25);
		pQueue.offer(10);
		//pQueue.offer(null);
		
		System.out.println(pQueue);
		
		System.out.println(pQueue.poll());
		System.out.println(pQueue.poll());
		System.out.println(pQueue.poll());
		System.out.println(pQueue.poll());
		
		System.out.println(pQueue);
		
	}
}
