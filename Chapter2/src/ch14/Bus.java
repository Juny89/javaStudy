package ch14;

public class Bus {
	
	int busNumber;//버스번호
	int passengerCount;//승객수
	int money;//수입
	
	//생성자(반환값이 없는것은 생성자)
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//메서드
	public void take(int money) {
		this.money += money;
		passengerCount++; //승객수 증가
	}
	
	//메서드
	public void showBusInfo() {
		System.out.println(busNumber + "번의 승객 수는 " + passengerCount +"명 이고, 수입은 " + money +"원 입니다.");
	}
	
	
}
