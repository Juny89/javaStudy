package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {

		/*
		byte bNum = 125;
		int iNum = bNum; //작은 byte형에서 상대적으로 더 큰 int형으로의 형변환은 문제없이 이루어진다
		
		System.out.println(iNum);

		int jNum = 255;
		byte kNum = (byte)jNum; //1byte에 들어갈 수 없는 큰 값이 강제 자료형변환을 시켰을 경우 값이 유실되며 이상한 값이 들어갈 수 있다
				
		System.out.println(kNum);
		
		double dNum = 3.14;
		int qNum = (int)dNum;
		
		System.out.println(qNum); //강제형변환 되며 소수점 뒤의 자리는 .14는 유실된다
		*/
		
		
		/*아래는 형변환을 어떤 순서에 하는지에 따라 결과값이 달라질 수 있다*/
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum + (int)fNum; 	//계산전에 Integer로 변환되어서 1과 0을 더해 1이 된거고
		int iNum2 = (int)(dNum + fNum);		//1.2와 0.9를 더해 2.1이 된 상태에서 Integer로 형변환 하여서 2가 남게 된다
		
		System.out.println(iNum1);
		System.out.println(iNum2);

		/*대입연산자*/
		int myNum = 10;
		int yourNum = 20;
		
		//myNum = myNum + yourNum;
		myNum += yourNum;
		
		System.out.println(myNum);
		
		
		
	}

}
