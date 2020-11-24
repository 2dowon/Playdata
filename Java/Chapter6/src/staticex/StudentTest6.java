package staticex;

public class StudentTest6 {

	public static void main(String[] args) {
		Student3 studentLee = new Student3();
		studentLee.setStudentName("이도원");
		System.out.println(studentLee.studentCard);
		System.out.println(studentLee.studentName +" 학생 카드 번호:"+ studentLee.studentCard);
		
		Student3 studentSeo = new Student3();
		studentSeo.setStudentName("서수진");
		System.out.println(studentSeo.studentCard);
		System.out.println(studentSeo.studentName +" 학생 카드 번호:"+ studentSeo.studentCard);
		
	}

}
