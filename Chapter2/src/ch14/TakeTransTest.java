package ch14;

public class TakeTransTest {//객체간의 협력

	public static void main(String[] args) {

		//James객체 생성
		Student studentJ = new Student("James", 5000);
		//Tomas객체 생성
		Student studentT = new Student("Tomas", 10000);
		
		//버스 객체 생성
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		//지하철 객체 생성
		Subway greenSubway = new Subway(2);
		Subway blueSubway = new Subway(3);
		Subway redSubway = new Subway(4);
		
		//제임스는 버스100을 토마스는 그린지하철을 탑승
		studentJ.takeBus(bus100);
		studentT.takeSubway(greenSubway);
		
		//탑승한 버스,지하철과 탑승한 승객의 showInfo()함수 실행
		studentJ.showInfo();
		studentT.showInfo();
		bus100.showBusInfo();
		greenSubway.showSubwayInfo();
		
		//아무도 타지 않은 버스와 지하철 showInfo()함수 실행
		bus500.showBusInfo();
		blueSubway.showSubwayInfo();
		
		
	}

}
