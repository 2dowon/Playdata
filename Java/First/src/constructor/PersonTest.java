package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person personKim = new Person();
		personKim.name = "������";
		personKim.weight = 85.5F;
		personKim.height = 180.0F;

		Person personLee = new Person("�̼���", 175, 75);

		System.out.println(personLee.height);
	}
	
}
