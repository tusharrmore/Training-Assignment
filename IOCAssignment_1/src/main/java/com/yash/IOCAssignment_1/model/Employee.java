package com.yash.IOCAssignment_1.model;

public class Employee {

	private String empId;
	
	private String empName;
	
	private String Trainee;

	public String getEmpId() {
		return empId;
	}
	
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getTrainee() {
		return Trainee;
	}

	public void setTrainee(String trainee) {
		Trainee = trainee;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", Trainee=" + Trainee + "]";
	}

	public Employee(String empId, String empName, String trainee) {
		super();
		this.empId = empId;
		this.empName = empName;
		Trainee = trainee;
	}

	
	
}
