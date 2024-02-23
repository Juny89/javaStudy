package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerT = new Customer(10010, "Tomas");
		Customer customerJ = new Customer(10020, "James");
		Customer customerE = new GoldCustomer(10030, "Edward");
		Customer customerP = new GoldCustomer(10040, "Percy");
		Customer customerK = new VIPCustomer(10050, "Kim");
		
		//ArrayList에 넣은것은 넣은 순서대로 들어간다
		customerList.add(customerT);
		customerList.add(customerJ);
		customerList.add(customerE);
		customerList.add(customerP);
		customerList.add(customerK);
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());//상위클래스에 있는 메서드여서 바로 사용가능
		}

		int price = 10000;
		
		for(Customer customer : customerList) {//customer는 for문 안에서만 쓴 지역변수이기 때문에 같은이름으로 또 사용가능
			
			int cost = customer.calcPrice(price);//각각의 가격
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + " 입니다.");
			
		}

	}
}