package ch14;

public interface Calc {

	double PI = 3.14;
	int ERROR = -999999999;
	
	//interface구현(상속이 X)
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	//default메서드 자바8 이후부터 가능 하위 클래스에서 재정의 가능
	default void description() {
		System.out.println("정수의 사칙연산을 제공합니다.");
	}

	//static메서드 자바9 이후부터 가능
	static int total(int[] arr) {
		
		int total = 0;
		for(int num : arr) {
			total += num;
		}
		
		myStaticMethod();
		return total;
	}
	
	private void myMthod() {
		System.out.println("myMethod");
	}
	
	private static void myStaticMethod() {
		System.out.println("myStaticMethod");
	}
	
}











