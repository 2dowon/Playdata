package test;

import First.hiding.Student

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("ÀÌ»ó¿ø");
	
		System.out.println(studentLee.getStudentName());
	}
}
