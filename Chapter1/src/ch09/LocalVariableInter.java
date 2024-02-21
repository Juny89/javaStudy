package ch09;

public class LocalVariableInter {

	public static void main(String[] args) {

		/*JavaSE 10버전 이후부터 variable의 약자 var로 지역변수에 한해서 자료형을 기재하지 않아도 된다
		 *컴파일 과정에서 알아서 자료형을 선언해준다 
		 *하지만 한번 특정 자료형으로 선언한 변수에 다른 자료형의 값을 넣는것은 허용되지 않는다(자바스크립트는 가능)
		 */
		
		var i = 10;
		var j = 10.0;
		var str = "test";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2 = str;
		System.out.println(str2);
		
		str = "hello"; //str변수는 이미 String으로 만들어진 변수이기 때문에 같은 형태의 자료형인 문자를 넣을 수 있다
		//str = 3; 정수이기 때문에 이미 String으로 만들어진 str변수에 Integer형태의 정수를 넣을 수 없다
		System.out.println(str);
	}

}
