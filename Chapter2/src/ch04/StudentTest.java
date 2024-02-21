package ch04;

public class StudentTest {

	public static void main(String[] args) {	
		//인스턴스 생성(인스턴스는 heap memory에 저장이 된다.) heap memory는 동적 메모리에 저장이 된다.
		Student studentLee = new Student(); //Student:데이터타입 , studentLee:변수의 이름, new Student();:생성자 Student클래스를 사용하기 위한 준비.
		
		studentLee.studentId = 12345;		//studentLee의 경우 "참조변수" 라고 한다.
		studentLee.setStudentName("Lee");	//Student클래스의 set메서드를 이용하여 데이터 삽입.
		studentLee.address = "서울 강남구"; //Student클래스의 지역변수에 직접 데이터 삽입.
		
		studentLee.showStudentInfo();    	//Student클래스의 showStudentInfo() 메서드 실행.
		
		Student studentKim = new Student();	//studentKim도 studentLee와 같이 인스턴스(=객체)라고 한다.
		studentKim.studentId = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "경기도 성남시";
		
		studentKim.showStudentInfo();	
	}

}
