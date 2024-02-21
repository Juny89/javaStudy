package ch15;

public class Taxi {
	
	//Taxi 클래스에서 사용할 멤버변수 선언(Taxi명, 돈)
	String taxiName;
	int money;
	
	//매개변수를 2개 갖는 생성자 선언(택시명, 돈 두개의 정보로 Taxi 객체를 생성 가능)
	public Taxi(String taxiName, int money) {
		this.taxiName = taxiName;
		this.money = money;
	}
	
	//돈을 받는 메서드 생성(인자값으로 전달받은 int값을 Taxi클래스의 멤버변수 money에 적립)
	public void take(int money) {
		this.money += money;
	}
	
	//Taxi의 상태정보를 콘솔창에 찍어볼 수 있는 taxiShowInfo() 메소드 선언
	public void taxiShowInfo() {
		System.out.println(taxiName + "택시 수입은 " + money + "원 입니다.");
	}
	
	
}
