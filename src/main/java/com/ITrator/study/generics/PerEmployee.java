package com.ITrator.study.generics;

public class PerEmployee extends Employee
{
	private double fixedSalary;

	public PerEmployee(String name, long empId, double salary) {
		super(name, empId);
		this.fixedSalary = salary;
	}
	
	public double getFixedSalary() {
		return fixedSalary;
	}

	public void setFixedSalary(double fixedSalary) {
		this.fixedSalary = fixedSalary;
	}

	@Override
	public String toString() {
		return "PerEmployee [fixedSalary=" + fixedSalary + "]";
	}

	
	
}
