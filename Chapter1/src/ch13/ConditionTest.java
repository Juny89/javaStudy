package ch13;

import java.util.Scanner; // java.util 안에 있는 Scanner클래스를 사용하기 위해 import한다

public class ConditionTest {

	public static void main(String[] args) {

		int max;
		System.out.println("두 수를 입력 받아서 더 큰 수를 출력하세요\n");
		
		Scanner scanner = new Scanner(System.in); //System.in 은 '표준입력'을 의미한다 System.out 은 '표준출력'을 의미
		
		System.out.println("입력 1:");
		int num1 = scanner.nextInt();
		System.out.println("입력 2:");
		int num2 = scanner.nextInt();
		
		max = (num1 > num2) ? num1 : num2;
		System.out.println(max);
		
	}

}
