package ch15;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		Buy buyer = customer; //Buy라는 타입으로 customer를 매핑 시킬 수 있음(업캐스팅, 묵시적 형변환)
		buyer.buy();
		buyer.order();
		
		Sell seller = (Sell)customer; //(Sell)은 안써도 됨 위와같이 묵시적 형변환 가능
		seller.sell();
		seller.order(); //Customer.java에서 재정의 하였음
	}

}
