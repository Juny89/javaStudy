package ch06;

public class OrderTest {

	public static void main(String[] args) {

		//defult생성자를 통해 kimOrder라는 객체 수동 선언
		Order kimOrder = new Order();
		
		//생성된 kimOrder객체에 있는 매개변수들에 데이터 직접 삽입
		kimOrder.orderNumber = 12;
		kimOrder.orderPhoneNumber = "01012341234";
		kimOrder.orderAddress = "서울시";
		kimOrder.orderDate = "1월2일";
		kimOrder.orderTime = "3시 10분";
		
		System.out.println(kimOrder.orderShowView());
		
		
		//매개변수가 5개 있는 생성자를 통해 junOrder라는 이름을 가진 Order객체 생성
		Order junOrder = new Order(13, "01025470944", "성동구", "2월20일", "4시 00분");

		System.out.println(junOrder.orderShowView());
		
	}
}
