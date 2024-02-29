package ch08;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("������ �����Դϴ�");
	}
}

class Human extends Animal{
	
	@Override
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal{
	
	@Override
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal{
	
	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���� �ٴմϴ�.");
	}
	
	public void flying() {
		System.out.println("�������� �糯���� �� ��� ���ư��ϴ�.");
	}
}



public class AnimalTest {

	public static void main(String[] args) {

		Animal hAnimal = new Human();	//��ĳ����
		Animal tAnimal = new Tiger();	//��ĳ����
		Animal eAnimal = new Eagle();	//��ĳ����
	
		AnimalTest test = new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);
	
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList) {
			animal.move(); //������ move()���
		}
		
		test.testDownCasting(animalList); //�ٿ�ĳ���� ���
	}

	//�ٿ�ĳ����
	public void testDownCasting(ArrayList<Animal> list) {
		
		for(int i = 0; i<list.size(); i++) {
		
			Animal animal = list.get(i);
			
			if(animal instanceof Human) {
			
				Human human = (Human)animal;
				human.readBook();
			}
			else if(animal instanceof Tiger) {
				
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			else if(animal instanceof Eagle) {
				
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
			else {
				
				System.out.println("unsupperted type");
			}
		}
	}
	
	
	public void moveAnimal(Animal animal) {
		animal.move();
		
	}
}