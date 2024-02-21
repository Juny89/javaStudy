package ch06;

public class Order {
	
	//Order클래스의 매개변수 선언
	public int orderNumber;
	public String orderPhoneNumber;
	public String orderAddress;
	public String orderDate;
	public String orderTime;
	public int orderCharge;
	public int orderMenuNo;
	
	//default생성자 수동 선언
	public Order() {};
	
	//매개변수가 5개 있는 생성자 선언
	public Order(int orderNumber, String orderPhoneNumber, String orderAddress, String orderDate, String orderTime) {
		
		this.orderNumber = orderNumber;
		this.orderPhoneNumber = orderPhoneNumber;
		this.orderAddress = orderAddress;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		
	}
	
	//orderShowView()라는 메소드 생성
	public String orderShowView() {

		return "주문이 들어왔습니다. 주문번호는 : " + orderNumber + "이며, 주문자의 연락처는 : " + orderPhoneNumber + "입니다. 주소는 : " + orderAddress + "입니다. 주문시각은 : " + orderDate + " " + orderTime + "입니다. ";
	}
}
