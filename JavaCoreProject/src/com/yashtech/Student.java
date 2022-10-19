package com.yashtech;

import java.util.Scanner;

public class Student {
	 
	private String studentId	;
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 500; 
	private static int id = 1000;
	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - First\n2 - second\n3 - third\n4 - fourth\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);
		
	}
		// Generate an ID
		private void setStudentID() {
			//Grade Level + ID
			id++;
			this.studentId = gradeYear + "" + id;
		}
		
		//Enroll in courses
		public void enroll() {
			//Get inside a loop, user hits 0
			do {
			System.out.println("Enter course to enroll(Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses +"\n" +course;
				tuitionBalance = tuitionBalance + costOfCourse; 
			}
			else {
				break;
			}
			} while (1 !=0);
			
			System.out.println("ENROLLED IN: " + courses);
			System.out.println("TUITION BALANCE: " + tuitionBalance);
		}
	
		//view Balance
		public void viewBalance() {
			System.out.println("Your Balance is: $" + tuitionBalance);
		}
		
		//pay Tution
		public void payTution() {
			viewBalance();
			System.out.println("Enter Your payment: $");
			Scanner in = new Scanner(System.in);
			int payment = in.nextInt();
			tuitionBalance = tuitionBalance - payment;
			System.out.println("Thank you for your payment of $" + payment);
			viewBalance();
		}
		
		//show Status
		public String showInfo() {
			return "Name: "+ firstName + " " + lastName +
					"\nGrade level: " + gradeYear +
					"\nStudent Id: " + studentId +
					"\nCourses Enrolled:" + courses +
					"\nBalance: $" + tuitionBalance;
			
		}
}
