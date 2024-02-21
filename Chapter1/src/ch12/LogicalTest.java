package ch12;

public class LogicalTest {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		
		//&& 비교 연산자에서 앞의 항이 이미 false이기 때문에 뒤의 항은 연산하지 않는다 그러므로 i의 값은 그대로 이다
		//boolean value = ( (num1 = num1 +10) < 10) && ( (i = i+2) < 10);
		
		//|| 비교 연산자의 경우 둘중 하나만 true여도 true이기때문에 앞의 항이 false가 나와도 뒤의 항도 연산하게 된다
		boolean value = ( (num1 = num1 +10) < 10) || ( (i = i+2) < 10);
		
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}

}
