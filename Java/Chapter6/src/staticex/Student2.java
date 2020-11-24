package staticex;

public class Student2 {
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}

	public static int getSerialNum() {
		int i = 10; // 지역변수
		return serialNum;
	}
	
	public static void setStudentName(int serialNum) {
		Student2.serialNum = serialNum;
	}
	
	
}
