package ch10;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	public abstract void wiper(); 
	public void starCar() {
		System.out.println("시동을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	//구현부가 없는 메소드 선언 hook메서드 라고 함 / 필요한 경우에 상위클래스에서 정의하고 하위 클래스에서 재정의하여 사용
	public void washCar() {} //추상메서드가 아닌 구현된 메서드(구현내용statement은(는) 없음)
	
	final public void run() { //변하면 안되는 시나리오(시동켜고>달리고>멈추고>시동종료) final로 선언(수정방지)
		starCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
