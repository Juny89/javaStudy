package ch14;
//Calc인터페이스의 총4개 메서드중 2개만 구현할것이기 때문에 나머지 2개때문에 abstract로 선언 
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
