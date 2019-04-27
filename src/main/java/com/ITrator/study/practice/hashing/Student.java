package com.ITrator.study.practice.hashing;

public class Student 
{
	private int rollNumber;
	
	private String name;
	
	private String address;
	
	public Student(int rollNumber, String name, String address)
	{
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public int hashCode()
	{
		System.out.println("HashCode << " + rollNumber + ">>" + rollNumber + name.length());
		return rollNumber + name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Student st = (Student) obj;
		System.out.println("Equals << " + rollNumber + ">>" + this.name.equals(st.name));
		return this.name.equals(st.name);
	}
	
	@Override
	public String toString()
	{
		return "[RollNumber=" + rollNumber + ", Name=" + name + ", Address="+address + "]";
	}
}
