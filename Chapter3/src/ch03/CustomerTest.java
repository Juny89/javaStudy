package ch03;

import javax.sound.midi.VoiceStatus;

public class CustomerTest {

	public static void main(String[] args) {

		
		Customer customerLee = new Customer(10010, "�̼���"); 
		  
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		 
		VIPCustomer customerKim = new VIPCustomer(10020, "������");

		customerKim.bonusPoint = 10000;
		// showCustomerInfo() �޼���� CustomerŬ������ �޼��� ������, ����� �޾ұ⿡ ��� �����ϴ�
		System.out.println(customerKim.showCustomerInfo());
		
		Customer vc = new VIPCustomer(12345, "no-name");
		
		System.out.println(vc.showCustomerInfo() + " ���̵�� " +  vc.customerID);
		
		/*
		 * �߿� : ����Ŭ������ �����ɶ��� �׻� ���� Ŭ������ ���� ����(ȣ��)�� �ȴ� �ƹ��͵� ������ defult�� super()�� �Ҹ���鼭
		 * defualt construct�� ����� �ȴ� �Ű������� �����ϴ� construct�� �־ default construct�� ������
		 * �ʰԵǸ� �����(����)���ζ� default construct�� �������־�� �Ѵ�
		 * 
		 * ����Ŭ���� �����ڸ� ȣ���ϸ�, ����Ŭ������ ������ �켱 ȣ���Ͽ� 
		 * ����Ŭ������ ��������� ���� �޸𸮿� �����Ѵ�
		 * private�� ��������� ���� �޸𸮿� ���������� ȣ���� ���� ���� ���̴�
		 * �̷��� ���� Ŭ������ private�� ����������� protected�� �ٲ��ִ� �ȴ�
		 */
	}
}