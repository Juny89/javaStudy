package ch15;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		Buy buyer = customer; //Buy��� Ÿ������ customer�� ���� ��ų �� ����(��ĳ����, ������ ����ȯ)
		buyer.buy();
		buyer.order();
		
		Sell seller = (Sell)customer; //(Sell)�� �Ƚᵵ �� ���Ͱ��� ������ ����ȯ ����
		seller.sell();
		seller.order(); //Customer.java���� ������ �Ͽ���
	}

}
