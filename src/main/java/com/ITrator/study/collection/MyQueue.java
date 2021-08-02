package com.ITrator.study.collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class MyQueue 
{
	public static void main(String...a)
	{
		Queue<String> que = new LinkedList<>();
		
		que.add("krishna");
		que.add("Mohan");
		que.add("Keshari");
		
		System.out.println(que);
		
		System.out.println(que.poll());

		System.out.println(que);
	}
}
