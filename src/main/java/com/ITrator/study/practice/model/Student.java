package com.ITrator.study.practice.model;

/**
 * @author kmlk
 *
 */
public class Student implements Comparable<Student>{
	private String name;
	
	private int rollNumber;
	
	private double marks;

	public Student(String name, int rollNumber, double marks)
	{
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() 
	{
		return ("{ " + name +  "  " + rollNumber +  "  " + marks + "}");
	}


	@Override
	public int compareTo(Student std) {
		return this.getName().compareTo(std.getName());
	}
}
