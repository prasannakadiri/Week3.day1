package org.system;

// Assignment 2

public class student extends Department {

	public void studentName(String StuName) {
		System.out.println("Student Name is " + StuName);
	}

	public void studentID(int StuId) {
		System.out.println("Student ID is " + StuId);
	}

	public void studentDept(int deptId) {
		System.out.println("Student Department ID is " + deptId);
	}

	// same method different type parameters method overriding

	public void getstudentInfo(int stuId, String StuName) {
		System.out.println("Student ID and Name");
		System.out.println("___________________");
		System.out.println("Student ID is " + stuId);
		System.out.println("Studen Name is " + StuName);

	}

	public void getStudentInfo(String deptName, String StuName) {
		System.out.println("Student Name and Department");
		System.out.println("___________________");
		System.out.println("Student Department  is " + deptName);
		System.out.println("Studen Name is " + StuName);
	}

	public static void main(String[] args) {

		student objStudent1 = new student();

		objStudent1.collegeName("S.V.C.E.T");
		objStudent1.collegeCode(2233);
		objStudent1.collegeRank(8);

		objStudent1.studentName("MLP");
		objStudent1.studentID(316);
		objStudent1.studentDept(4);

		objStudent1.deptName("Mechanical");

		objStudent1.getstudentInfo(316, "MLP");

		System.out.println("overriding methods can be called now ");

		objStudent1.getStudentInfo("Mechanical", "MLP");
	}

}
