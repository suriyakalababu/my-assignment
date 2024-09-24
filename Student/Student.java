package org.Student;

import org.department.Department;

public class Student extends Department {
	public void studentname() {
		System.out.println("Suriyakala");
		
	}
	public void studentid () {
		System.out.println("2219191");
	}
	public void studentdept() {
		System.out.println("computer Science and Engineering");
	}

	public static void main(String[] args) {
		Student obj= new Student();
		obj.collagename();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentdept();
		obj.studentid();
		obj.studentname();
		
		
	}

}
