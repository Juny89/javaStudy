package ch04;

import javax.sound.midi.VoiceStatus;

public class CustomerTest {

	public static void main(String[] args) {

		
		Customer customerLee = new Customer(10010, "�̼���"); 
		int price = customerLee.calcPrice(1000);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo() + price);
		 
		VIPCustomer customerKim = new VIPCustomer(10020, "������");
		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(1000);
		// showCustomerInfo() �޼���� CustomerŬ������ �޼��� ������, ����� �޾ұ⿡ ��� �����ϴ�
		System.out.println(customerKim.showCustomerInfo() + price);
		
		
		//�������̵� �Ǿ��⶧���� ���� �ν��Ͻ��� �޼���(VIPCustomer�� �������̵��� calcPrice() �޼��尡 ȣ��ȴ�
		Customer vc = new VIPCustomer(12345, "noname");
		price = vc.calcPrice(1000);
		System.out.println(vc.showCustomerInfo() + price);
		
	}
}