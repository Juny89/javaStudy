package ch14;

public interface Calc {

	double PI = 3.14;
	int ERROR = -999999999;
	
	//interface����(����� X)
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	//default�޼��� �ڹ�8 ���ĺ��� ���� ���� Ŭ�������� ������ ����
	default void description() {
		System.out.println("������ ��Ģ������ �����մϴ�.");
	}

	//static�޼��� �ڹ�9 ���ĺ��� ����
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











