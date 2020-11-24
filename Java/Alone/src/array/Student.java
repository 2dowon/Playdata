package array;

public class Student {
	int studentID;
	String studentName;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	public void showStudentInfo() {
		System.out.println(studentID + "," + studentName);
	}
}
