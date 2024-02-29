package ch09;

public class ComputerTest {

	public static void main(String[] args) {

		//Desktop desktop = new Desktop();
		Computer desktop = new Desktop(); //상속에서 업캐스팅은 묵시적으로 가능하기에 이렇게 쓰는것도 가능하다
		//Computer computer = new Computer(); 추상메서드를 포함하고 있기에 new가 불가능하다
		
		/*
		 * 전부 구현을 해놓은 클래스여도, abstract 키워드 사용이 가능하다 
		 * abstract 키워드가 들어간 추상 클래스는 상속만을 위한 클래스가 된다
		 */
	}

}
