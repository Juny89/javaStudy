package ch15;

public class Student {
	//Student클래스에서 사용할 멤버변수(학생이름, 돈) 생성
	String studentName;
	int money;
	
	//Student클래스의 매개변수를 2개 갖는 생성자 선언(Student클래스를 생성하기 위함 이름,돈 정보로)
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	//택시를 타는 행위인 takeTaxi메서드 생성(take.taxi는 Taxi클래스에 존재하며 10000이라는 int값을 전달)
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);//10000원을 Taxi클래스 에 전달
		this.money -= 10000;
	}
	
	//학생의 현재 정보를 콘솔창에 찍어주는 studentShowInfo() 메소드 생성
	public void studentShowInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
}
