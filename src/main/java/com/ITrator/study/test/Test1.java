package com.ITrator.study.practice.test;

public class Test1 {
	public static void main(String...a)
	{
		String s = new String();
		System.out.println(" String is " + s);
		System.out.println(" toString is " + s.toString());
		s = "First String";
		System.out.println("Assigned String is " + s);
		StringBuilder sb = new StringBuilder();
		System.out.println("Sb is " + sb.toString());
		sb = new StringBuilder("Krishna mohan lal keshari i am from varanasi");
		System.out.println("new Sb is " + sb);
	}
}
