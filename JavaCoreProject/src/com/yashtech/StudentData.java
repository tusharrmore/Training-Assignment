package com.yashtech;

import java.util.Scanner;

public class StudentData {
	
	public static void main(String[] args) {
		
		Student s1= new Student();
		s1.enroll();
		s1.payTution();
		System.out.println(s1.toString());
		
		//Ask how many new student we want to add 
		System.out.println("Enter number of new student to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudent = in.nextInt();
		Student[] stu = new Student[numOfStudent];
		
		//Create n number of student
		for (int n = 0; n < numOfStudent; n++) {
			stu[n] = new Student();
			stu[n].enroll();
			stu[n].payTution();
		}
		
		for (int n=0; n < numOfStudent; n++) {
			System.out.println(stu[n].toString());
		}
	}

}
