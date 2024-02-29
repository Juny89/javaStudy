package ch10;

public class CarTest {

	public static void main(String[] args) {

		Car aicar = new AICar();
		
		/* 다형성(Polymophysm)
		 * Car aicar : Car타입의 변수 aicar 선언 / new AICar() : AICar 클래스의 객체를 생성
		 * 
		 * AICar클래스는 Car클래스를 상속 받았기 때문에 Car클래스 안에 있는 메서드를 사용가능 하지만, 타입 자체를 Car클래스로 선언
		 * 하였기때문에, AICar클래스 에만 있는 메서드는 사용 불가능 이것을 사용하기 위해서는 업캐스팅을 하여야 한다
		 */		
		aicar.run();
		
		System.out.println("====================");
		
		Car mCar = new ManualCar();
		mCar.run();
	}

}
