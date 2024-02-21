package ch21;

public class BreakTest {

	public static void main(String[] args) {//1부터 숫자를 더하여 100이 넘는 순간의 그 숫자와 합을 출력

		int sum = 0;
		int num;
		
		for(num = 1; ; num++) {
			
			sum += num;
			if( sum >= 100) {
				break;
			}
		}
		
		System.out.println(sum);
		System.out.println(num);
	}

}
