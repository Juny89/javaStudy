package ch20;

public class NestedLoopTest {

	public static void main(String[] args) {

		int dan = 2;
		int count = 1;
		
//		for(; dan <= 9; dan++) { //for문 이용하여 구구단 출력 만들기
//			
//			System.out.println(dan+"단");
//			
//			for(count = 1; count <= 9; count++) {
//				
//				System.out.println(dan+" X "+count+" = " + dan*count);
//				
//			}
//			System.out.println();
//		}
		
		while(dan <= 9) {
			
			while(count <= 9) {
				System.out.println(dan+" X "+count+" = " + dan*count);
				count++;
			}
			dan++;
			System.err.println();
			count = 1; //while의경우 count가 이미 10이기 때문에 다시 초기화를 해주어야 한다
		}
	}
}
