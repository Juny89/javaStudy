package ch15;

public class TakeTransTest {

	public static void main(String[] args) {

		//에드워드 객체(studentE) 생성, Student클래스에 String값 "Edward"와 int값 20000을 전달
		Student studentE = new Student("Edward", 20000);
		
		//택시 객체 생성, String 택시명과 int 잔고 0원 전달
		Taxi taxi = new Taxi("잘나간다 운수", 0);
		
		//studentE가 takeTaxi메서드 실행(택시를 타는 행위) takeTaxi는 Student클래스 안에 존재
		studentE.takeTaxi(taxi);
		
		studentE.studentShowInfo();
		taxi.taxiShowInfo();
	}

}
