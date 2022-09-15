package com.yash;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Teacher lavish = new Teacher(1, "lavish", 500);
        Teacher raju = new Teacher(2,"Raju",700);
        Teacher kaju = new Teacher(3,"Kaju",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lavish);
        teacherList.add(raju);
        teacherList.add(kaju);


        Student tushar = new Student(1,"Tushar",400);
        Student sumit = new Student(2,"Sumit",500);
        Student shubham = new Student(3,"Shubham",600);
        List<Student> studentList = new ArrayList<>();

        studentList.add(tushar);
        studentList.add(sumit);
        studentList.add(shubham);

        School sh = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        sh.addTeacher(megan);

        System.out.println("------Making SCHOOL PAY SALARY----");
        lavish.receiveSalary(lavish.getSalary());
        System.out.println("GHS has spent for salary to " + lavish.getName()
        +" and now has $" + sh.getTotalMoneyEarned());

        kaju.receiveSalary(kaju.getSalary());
        System.out.println("GHS has spent for salary to " + kaju.getName()
                +" and now has $" + sh.getTotalMoneyEarned());

        System.out.println(sumit);

        raju.receiveSalary(raju.getSalary());

        System.out.println(raju);
    }
}
