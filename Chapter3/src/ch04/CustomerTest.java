package ch04;

import javax.sound.midi.VoiceStatus;

public class CustomerTest {

	public static void main(String[] args) {

		
		Customer customerLee = new Customer(10010, "이순신"); 
		int price = customerLee.calcPrice(1000);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo() + price);
		 
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(1000);
		// showCustomerInfo() 메서드는 Customer클래스의 메서드 이지만, 상속을 받았기에 사용 가능하다
		System.out.println(customerKim.showCustomerInfo() + price);
		
		
		//오버라이딩 되었기때문에 실제 인스턴스의 메서드(VIPCustomer의 오버라이딩된 calcPrice() 메서드가 호출된다
		Customer vc = new VIPCustomer(12345, "noname");
		price = vc.calcPrice(1000);
		System.out.println(vc.showCustomerInfo() + price);
		
	}
}