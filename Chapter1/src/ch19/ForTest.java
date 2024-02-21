package ch19;

public class ForTest {

	public static void main(String[] args) { //1부터 10까지의 합을 구하는 for문

		int count = 1;
		int sum = 0;
		
		for(int i= 0; i< 10; i++, count++) { //초기화식과 문장을 여러개 쓸 수있다. , 로 구분
			sum += count;
		}
		
		System.out.println(sum);
		
		int num = 1;
		int total = 0;
		
		while(num <= 10) { //1qnxj 10까지의 합을 구하는 while문
			
			total += num;
			num++;
		
		}
		System.out.println(total);
	}
}
