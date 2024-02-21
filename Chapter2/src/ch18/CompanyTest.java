package ch18;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {

		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();//private으로 getInstance()만 허용되어 있기에 여러번 생성해도 같은 메모리를 바라보고있다(하나만 사용가능)
		
		System.out.println(company1);//아래와 같은 값이 나온다 static으로 선언되어 있기 때문에
		System.out.println(company2);//싱글톤 패턴은 하나의 인스턴트만 사용 가능하도록 되어있는 것이다
		
		//Calendar calendar = new Calendar;
		Calendar calendar = Calendar.getInstance();
		//자바 util에서 제공하는 Calendar클래스도 private으로 지원하기 때문에 new로 객체 생성을 할 수 없으며, getInstance로만 사용이 가능하다.
	}

}
