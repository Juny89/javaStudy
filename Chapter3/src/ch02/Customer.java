package ch02;

public class Customer {

	protected int customerID;	//protected�� ���� ��Ű������ ��� �����ϴ�
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;	//package default�� �θ� �ܺ� ��Ű������ ����� �ȵǼ� ������� ������ �ȴ�
	double bonusRatio;

	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusRatio + "�Դϴ�.";
	}
}