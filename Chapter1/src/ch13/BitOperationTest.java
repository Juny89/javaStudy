package ch13;

public class BitOperationTest {
	/*비트 연산자*/
	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 10;
		
		System.out.println( num1 | num2);	//OR연산
		System.out.println( num1 & num2);	//AND연산
		System.out.println( num1 ^ num2);	//XOR연산
		System.out.println( ~num1);			//NOT연산
		
		//System.out.println(num1 << 2);		//왼쪽으로 2번 시프트 num1을 복사해와서 시프트
		System.out.println(num1 <<= 2);	//대입연산자까지 사용하게되면 num1의 값이 바뀌게 된다
		System.out.println(num1 >>= 1);
		
		System.out.println(num1);			//num1의 값은 변하지 않고 그대로 5이다
		
	}

}
