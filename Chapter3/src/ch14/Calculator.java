package ch14;
//Calc�������̽��� ��4�� �޼����� 2���� �����Ұ��̱� ������ ������ 2�������� abstract�� ���� 
public abstract class Calculator implements Calc{

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

}
