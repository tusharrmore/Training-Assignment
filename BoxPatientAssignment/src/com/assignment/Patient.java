package com.assignment;

public class Patient {
	
	private String patientName;
	private double height;
	private double weight;
	
	public Patient(String patientName, double height, double weight) {
		super();
		this.patientName = patientName;
		this.height = height;
		this.weight = weight;

	}

	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", height=" + height + ", weight=" + weight + "]";
	}

	public double computeBMI() {
		return this.weight/(this.height*this.height);
	}
	
	public static void main(String[] args) {
		Patient p=new Patient("abc",5.7,89);
		System.out.println(p.computeBMI());
	}

}
