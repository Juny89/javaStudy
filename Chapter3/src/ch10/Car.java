package ch10;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	public abstract void wiper(); 
	public void starCar() {
		System.out.println("�õ��� �մϴ�");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�");
	}
	//�����ΰ� ���� �޼ҵ� ���� hook�޼��� ��� �� / �ʿ��� ��쿡 ����Ŭ�������� �����ϰ� ���� Ŭ�������� �������Ͽ� ���
	public void washCar() {} //�߻�޼��尡 �ƴ� ������ �޼���(��������statement��(��) ����)
	
	final public void run() { //���ϸ� �ȵǴ� �ó�����(�õ��Ѱ�>�޸���>���߰�>�õ�����) final�� ����(��������)
		starCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
