package classpart;

public class ShoppingTest {

	String order_num; // �ֹ���ȣ
	String id; // �ֹ��� ���̵�
	String order_date; // �ֹ� ��¥
	String name; // �ֹ��� �̸�
	String order_prod_num; // �ֹ� ��ǰ ��ȣ
	String address; // ��� �ּ�
	
	public static void main(String[] args) {
		shopping order1 = new shopping();
		order1.order_num = "201803120001" ;
		order1.id = "abc123";
		order1.order_date = "2018�� 3�� 12��";
		order1.name = "ȫ���";
		order1.order_prod_num = "PD0345-12";
		order1.address = "����� �������� ���ǵ��� 20����";
		
		
		
	}

}
