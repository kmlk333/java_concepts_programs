package com.ITrator.study.collection;

import java.util.Stack;

public class MyStack 
{
	public static void main(String...a)
	{
		Stack<String> st = new Stack<>();		
		st.push("Krishna");
		st.push("mohan");
		st.push("mohan");
		st.push("keshari");
		
		System.out.println(st);
		
		System.out.println(st.pop());
		System.out.println(st.pop());
	}
}
