package ch10;

public class BirthDayTest {

	public static void main(String[] args) {

		BirthDay date = new BirthDay();
		date.setYear(2019);
		date.setMonth(12);
		date.setDay(30);
		
		//date.month = 100; 이런 쓸대없는 데이터 입력을 막아주기 위해 private으로 접근제어자를 설정한다.
		
		date.showDate();
		
	}

}
