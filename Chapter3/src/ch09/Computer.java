package ch09;

public abstract class Computer {

	public abstract void display();//구현이 되지 않은 추상메서드
	public abstract void typing();//구현이 되지 않은 추상메서드
	
	public void turnOn() {//구현이 된 메서드
		
		System.out.println("전원을 켭니다");
	}
	
	public void turnOff() {//구현이 된 메서드
		
		System.out.println("전원을 끕니다");
	}
}
