package com.ITrator.study.generics;

public class Employee {
	
	private String empName;
	private long empId;
	
	public Employee(String empName, long empId) {
		this.empId = empId;
		this.empName = empName;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	
	
}
