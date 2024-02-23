package ch04;

public class VIPCustomer extends Customer {

	double salesRatio;
	private String agentID; //담당 상담원
	
	/*
	public VIPCustomer() {
		// super(); 이 코드는 상위 생성자를 호출하는 기능이고, 생략해도 컴파일러에서 자동으로 작성해 준다 
		// 기본적으로 해당 VIPCustomes 의 상위 클래스인 Customer()클래스의 defualt생성자를 호출해주게 된다
		// 상위 클래스에 매개변수 존재하는 생성자가 있을 경우, 자동으로 defualt생성자가 묵시적으로 생성되지 않기 때문에 이러한 경우에는
		// 명시적으로 직접 defualt 생성자를 상위 클래스에 생성해주어야 한다.
		super(0, "no-name");
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer() call");
	}
	*/
	
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
	}
	

	public String getAgentID() {
		return agentID;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}


	
	
	
	
}	