package ch09;

public class Desktop extends Computer{

	@Override //�߻�޼��带 �������̵� �ؼ� ����Ŭ�������� ���
	public void display() {
		System.out.println("Desktop display");
	}

	@Override //�߻�޼��带 �������̵� �ؼ� ����Ŭ�������� ���
	public void typing() {
		System.out.println("Desktop typing");
	}

	@Override //����Ŭ������ �޼��带 ������
	public void turnOff() {
		System.out.println("Desktop turnOff");
	}
	
}
