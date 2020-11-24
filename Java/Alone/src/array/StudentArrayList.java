package array;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList<Student> studentArray = new ArrayList<Student>();
		
		studentArray.add(new Student(1001, "James"));
		studentArray.add(new Student(1002, "Tomas"));
		studentArray.add(new Student(1003, "Edward"));
		
		for (int i = 0; i < studentArray.size(); i++) {
			Student student = studentArray.get(i);
			student.showStudentInfo();
		}
	}

}
