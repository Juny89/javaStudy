package ch06;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(); //default 생성자가 Student클래스에 이미 컴파일 과정에서 만들어져 있기 때문에 이렇게 사용 가능하다.
		//여기서 오류가 나는 이유는? default생성자가 제공되지 않는 경우에 사용되기 때문이다. 이럴때는 default생성자를 수동으로 생성해줘야 한다.
		//default생성자는 생성자가 없는 경우에 만들어지는데 해당 Student클래스에는 이미 생성자가 있기 때문에 defualt생성자가 자동으로 만들어지지 않는다.
		
		System.out.println(studentLee.showStudentInfo());
		
		Student studentKim = new Student(123456, "Kim", 3); //매개변수가 3개 있는 Student생성자 생성 후 매개변수 전달
		System.out.println(studentKim.showStudentInfo());
		
		
	}

}
