package ch22;

public class ContinueTest {

	public static void main(String[] args) {//1부터 100까지 숫자 중 3의 배수를 출력

		int num;
		
		for(num = 1; num <= 100; num++) {
			
			if( (num %3) != 0) continue; //반복문 안에서 continue를 만나면 반복의 첫단계로 올라간다
			
			System.out.println(num);
		}
	}

}
