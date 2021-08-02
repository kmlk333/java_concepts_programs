package com.ITrator.study.generics;

public class ConEmployee extends Employee {

		private double salary;

		public ConEmployee(String name, long empId, double salary) {
			super(name, empId);
			this.salary = salary;
		}
		
		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "ConEmployee [salary=" + salary + ", getSalary()=" + getSalary() + ", getEmpName()=" + getEmpName()
					+ ", getEmpId()=" + getEmpId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		}
		
		
		
}
