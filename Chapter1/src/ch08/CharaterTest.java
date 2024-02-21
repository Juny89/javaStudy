package ch08;

public class CharaterTest {

	public static void main(String[] args) {
		
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1); //A를 Integer로 강제 형변환
		
		char ch2 = 66;
		System.out.println(ch2);	//char타입이기 때문에 숫자를 넣어도 문자로 치환되어 출력
		System.out.println((char)ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);	//char로 강제형변환(캐스팅)하면 67에 해당하는 알파벳 'C'가 출력
		
		char han = '한';
		char ch = '\uD55C';	//	유니코드 값으로 '한'을 나타낸다 D55C가 유니코드로 '한' 이다 유니코드 표 참조
		System.out.println(han);
		System.out.println(ch);
	}
	
}
