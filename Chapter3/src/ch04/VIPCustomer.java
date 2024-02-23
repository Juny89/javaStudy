package ch04;

public class VIPCustomer extends Customer {

	double salesRatio;
	private String agentID; //��� ����
	
	/*
	public VIPCustomer() {
		// super(); �� �ڵ�� ���� �����ڸ� ȣ���ϴ� ����̰�, �����ص� �����Ϸ����� �ڵ����� �ۼ��� �ش� 
		// �⺻������ �ش� VIPCustomes �� ���� Ŭ������ Customer()Ŭ������ defualt�����ڸ� ȣ�����ְ� �ȴ�
		// ���� Ŭ������ �Ű����� �����ϴ� �����ڰ� ���� ���, �ڵ����� defualt�����ڰ� ���������� �������� �ʱ� ������ �̷��� ��쿡��
		// ��������� ���� defualt �����ڸ� ���� Ŭ������ �������־�� �Ѵ�.
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