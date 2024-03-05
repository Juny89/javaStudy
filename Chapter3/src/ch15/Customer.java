package ch15;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("customer sell");
	}

	@Override
	public void buy() {
		System.out.println("customer buy");
	}

	
	//Buy, Sell 두 개의 interface의 default메서드가 중복 되므로 둘중 하나를 쓰던가, oder()메서드를 따로 재정의 해야 한다
	@Override
	public void order() {
		System.out.println("customer order");
	}
	
	public void hello() {
		System.out.println("hello");
	}


}
