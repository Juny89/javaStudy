package ch10;

public class CarTest {

	public static void main(String[] args) {

		Car aicar = new AICar();
		
		/* ������(Polymophysm)
		 * Car aicar : CarŸ���� ���� aicar ���� / new AICar() : AICar Ŭ������ ��ü�� ����
		 * 
		 * AICarŬ������ CarŬ������ ��� �޾ұ� ������ CarŬ���� �ȿ� �ִ� �޼��带 ��밡�� ������, Ÿ�� ��ü�� CarŬ������ ����
		 * �Ͽ��⶧����, AICarŬ���� ���� �ִ� �޼���� ��� �Ұ��� �̰��� ����ϱ� ���ؼ��� ��ĳ������ �Ͽ��� �Ѵ�
		 */		
		aicar.run();
		
		System.out.println("====================");
		
		Car mCar = new ManualCar();
		mCar.run();
	}

}
