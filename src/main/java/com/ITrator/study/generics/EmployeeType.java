package com.ITrator.study.generics;

public class EmployeeType<EmpType> {
	
	private EmpType employeeType;
	
	public EmployeeType(EmpType employeeType) {
		this.employeeType = employeeType;
	}
	
	public EmpType getEmployeeType() {
		return this.employeeType;
	}
}
