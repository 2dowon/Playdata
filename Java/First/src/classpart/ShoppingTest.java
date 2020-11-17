package classpart;

public class ShoppingTest {

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
		
		
		
	}

}
