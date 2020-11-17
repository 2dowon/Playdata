package classpart;

public class shopping {
	String order_num; // 주문번호
	String id; // 주문자 아이디
	String order_date; // 주문 날짜
	String name; // 주문자 이름
	String order_prod_num; // 주문 상품 번호
	String address; // 배송 주소
	
	public static void main(String[] args) {
		shopping order1 = new shopping();
		order1.order_num = "201803120001" ;
		order1.id = "abc123";
		order1.order_date = "2018년 3월 12일";
		order1.name = "홍길순";
		order1.order_prod_num = "PD0345-12";
		order1.address = "서울시 영등포구 여의도동 20번지";		
		
		System.out.println("주문 번호 : " + order1.order_num);
		System.out.println("주문자 아이디 : " + order1.id);
		System.out.println("주문 날짜 : " + order1.order_date);
		System.out.println("주문자 이름 : " + order1.name);
		System.out.println("주문 상품 번호 : " + order1.order_prod_num);
		System.out.println("배송 주소 : " + order1.address);
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
