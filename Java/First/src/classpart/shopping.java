package classpart;

public class shopping {
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
		
		System.out.println("�ֹ� ��ȣ : " + order1.order_num);
		System.out.println("�ֹ��� ���̵� : " + order1.id);
		System.out.println("�ֹ� ��¥ : " + order1.order_date);
		System.out.println("�ֹ��� �̸� : " + order1.name);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + order1.order_prod_num);
		System.out.println("��� �ּ� : " + order1.address);
	}

	public String getOrder_num() {
		return order_num;
	}

	public void setOrder_num(String order_num) {
		this.order_num = order_num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrder_prod_num() {
		return order_prod_num;
	}

	public void setOrder_prod_num(String order_prod_num) {
		this.order_prod_num = order_prod_num;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
