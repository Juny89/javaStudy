package ch17;

public class whileTest {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0; //지역변수는 자동 초기화가 되지 않기에 꼭 선언 및 초기화 까지 완료해주어야 한다
		
		while( num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1부터 10까지의 합은 " +sum+ "입니다.");
		System.out.println("현재 num의 값은 " +num+ "입니다.");
	}

}
