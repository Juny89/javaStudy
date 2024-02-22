package ch20;

public class CharArrayTest {

	public static void main(String[] args) {

		char[] alpahbets = new char[26];
		char ch = 'A';
		
		//A부터 Z까지 alpahbets 배열에 담는다
		for(int i=0; i<alpahbets.length; i++) {
			alpahbets[i] = ch++;
		}
		
		//alpahbets배열의 값을 향상된 for문을 활용해서 alpha배열에 하나씩 담고 출력한다
		for(char alpha : alpahbets) {
			System.out.println(alpha + "," + (int)alpha);
		}
		
	}

}
