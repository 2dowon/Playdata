package inheritance;

public class Customer {
	protected int customerID; // �� ���̵�
	protected String customerName; // �� �̸�
	protected String customerGrade; // �� ���
	int bonusPoint; // ���ʽ� ����Ʈ
	double bonusRatio; // ���� ����
	
//	public Customer() {
//		customerGrade = "SILVER"; // �⺻���
//		bonusRatio = 0.01; // ���ʽ� ����Ʈ �⺻ ���� ����
//		System.out.println("Customer() ������ ȣ��");
//	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER"; // �⺻���
		bonusRatio = 0.01; // ���ʽ� ����Ʈ �⺻ ���� ����
		System.out.println("Customer(int, String) ������ ȣ��");
	}
	
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio); // ���ʽ� ����Ʈ ���
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + " ���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ��" + bonusPoint + "�Դϴ�.";
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
}
