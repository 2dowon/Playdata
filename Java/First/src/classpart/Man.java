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
		
		System.out.println("�� ����� �̸��� " + James.name + "�Դϴ�.");
		System.out.println("�� ����� ���̴� " + James.age + "�� �Դϴ�.");
		System.out.println("�� ����� ��ȥ ���δ� " + James.isMarried + "�Դϴ�.");
		System.out.println("�� ����� �ڽ� ���� " + James.child + "�� �Դϴ�.");
	}
}
