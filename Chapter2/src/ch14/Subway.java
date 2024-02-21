package ch14;

public class Subway {
	
	int subwayNumber;//지하철번호
	int passengerCount;//승객수
	int money;//수입
	
	//생성자
	public Subway(int subwayNumber) {
		this.subwayNumber = subwayNumber;
	}
	
	//메서드
	public void take(int money) {
		this.money += money;
		passengerCount++; //승객수 증가
	}
	
	//메서드
	public void showSubwayInfo() {
		System.out.println(subwayNumber + "번의 승객 수는 " + passengerCount +"명 이고, 수입은 " + money +"원 입니다.");
	}
	
}
