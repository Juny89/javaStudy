package ch06;

public class VariableTest {

	public static void main(String[] args) {
		
		byte bnum = -128;
		//byte bnum = 128; byte는 127까지 표시할 수 있음

		
		//int num = 12345678900; int(4byte)로 표현 하기에 너무 길다
		long lNum = 12345678900L; //long은 8byte까지 표현 가능
		
		System.out.println(bnum);
		System.out.println(lNum);

	}

}
