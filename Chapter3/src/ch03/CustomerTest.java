package ch03;

import javax.sound.midi.VoiceStatus;

public class CustomerTest {

	public static void main(String[] args) {

		
		Customer customerLee = new Customer(10010, "이순신"); 
		  
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		 
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");

		customerKim.bonusPoint = 10000;
		// showCustomerInfo() 메서드는 Customer클래스의 메서드 이지만, 상속을 받았기에 사용 가능하다
		System.out.println(customerKim.showCustomerInfo());
		
		Customer vc = new VIPCustomer(12345, "no-name");
		
		System.out.println(vc.showCustomerInfo() + " 아이디는 " +  vc.customerID);
		
		/*
		 * 중요 : 하위클래스가 생성될때는 항상 상위 클래스가 먼저 생성(호출)이 된다 아무것도 없으면 defult로 super()가 불리우면서
		 * defualt construct가 생기게 된다 매개변수가 존재하는 construct가 있어서 default construct가 생기지
		 * 않게되면 명시적(수동)으로라도 default construct를 생성해주어야 한다
		 * 
		 * 하위클래스 생성자를 호출하면, 상위클래스의 생성자 우선 호출하여 
		 * 상위클래스의 멤버변수를 전부 메모리에 생성한다
		 * private한 멤버변수도 같이 메모리에 생성하지만 호출을 하지 못할 뿐이다
		 * 이럴땐 상위 클래스의 private한 멤버변수들을 protected로 바꿔주는 된다
		 */
	}
}