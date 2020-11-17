package classpart;

public class Man {
	int age;
	String name;
	boolean isMarried;
	int child;
	
	public static void main(String[] args) {
		Man James = new Man();
		James.name = "James";
		James.age = 40;
		James.isMarried = true;
		James.child = 3;
		
		System.out.println("이 사람의 이름은 " + James.name + "입니다.");
		System.out.println("이 사람의 나이는 " + James.age + "세 입니다.");
		System.out.println("이 사람의 결혼 여부는 " + James.isMarried + "입니다.");
		System.out.println("이 사람의 자식 수는 " + James.child + "명 입니다.");
	}
}
