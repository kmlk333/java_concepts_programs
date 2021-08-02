package com.ITrator.study.generics;

public class GenericTypeTest {

	public static void main(String[] args) {
		
		EmployeeType<PerEmployee> perEmp = new EmployeeType<PerEmployee>(new PerEmployee("Krishna", 100l, 23343.543));
		
		PerEmployee employee = perEmp.getEmployeeType();
		
		System.out.println(employee);
	}
}
