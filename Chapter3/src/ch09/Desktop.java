package ch09;

public class Desktop extends Computer{

	@Override //추상메서드를 오버라이드 해서 하위클래스에서 사용
	public void display() {
		System.out.println("Desktop display");
	}

	@Override //추상메서드를 오버라이드 해서 하위클래스에서 사용
	public void typing() {
		System.out.println("Desktop typing");
	}

	@Override //상위클래스의 메서드를 재정의
	public void turnOff() {
		System.out.println("Desktop turnOff");
	}
	
}
