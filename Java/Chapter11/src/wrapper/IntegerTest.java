package wrapper;

public class IntegerTest {

	public static void main(String[] args) {

		Integer num = 100;
		int iNum = num.intValue();  //Integer Ŭ�������� ���� ���� ������
		int jNum = 200;
		
		int sum = iNum + jNum;
		System.out.println(sum);
		
		int total = num + jNum;   //num.inValue() + jNum �� ��ȯ�� ��
		System.out.println(total);   
	
		Integer i = jNum;
		System.out.println(i);    //Integer.valueOf(j) �� ��ȯ�� ��
	}
}
