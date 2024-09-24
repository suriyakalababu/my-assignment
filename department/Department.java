package org.department;

import org.College.College;

public class Department extends College {
	
	public void deptName() {
		System.out.println(" Computer Science and Engineering");
		
	}
	public static void main(String[] args) {
		 Department de =new  Department();
		 de.collagename();
		 de.collegeCode();
		 de.collegeRank();
		 de.deptName(); 
}
}