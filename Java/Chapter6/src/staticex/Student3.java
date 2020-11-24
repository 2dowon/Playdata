package staticex;

public class Student3 {
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	int studentCard; //  ÇĞ¹ø studentID + 100
	
	public Student3() {
		serialNum = serialNum + 100;
		studentCard = serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}
}
