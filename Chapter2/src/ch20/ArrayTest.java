package ch20;

public class ArrayTest {

	public static void main(String[] args) {

		int[] arr = new int[10]; //10개짜리 배열 선언
		int total = 0;
		
//		for(int i=0, num=1; i<arr.length; i++, num++) {
//			arr[i] = num;
//		}
		
		for(int i=0, num=1; i<arr.length; i++) {
			arr[i] = num++;
		}
		
		
		//향상된 for문 이용해서 출력(향상된 for문은 처음부터 끝까지 돌림)
		for(int num : arr) {
			total += num;
		}
		
		System.out.println(total);
	
	}

}
