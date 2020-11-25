package polymorphism;

public class VIPCustomer extends Customer {
	private int agentID; // VIP 고객 담당 상담원 아이디
	double saleRatio; // 할인율
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP"; // 고객 등급 VIP
		bonusRatio = 0.05; // 보너스 적립 5%
		saleRatio = 0.1; // 할인율 10%
		this.agentID = agentID;
	}
	
	
	@Override // Overwritting (덮어쓰기 - 부모 성질을 자식이 덮어씀)
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // 보너스 포인트 적립
		return price - (int)(price * saleRatio); // 할인된 가격을 계산하여 반환
	}

	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 번호는 " + agentID + "입니다.";
	}
	
	public int getAgentID() {
		return agentID;
	}
}
