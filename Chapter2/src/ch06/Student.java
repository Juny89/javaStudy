package ch06;

public class Student {
	//아래의 멤버변수의 경우에는 초기화를 하지 않으면 String은 null, int는 0으로 초기화 되게 된다.
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() {}; //생성자를 만들지 않았을때 자동 생성되는 default 생성자.
	
	public Student(int studentNumber, String studentName, int grade) {//매개변수가 3개인 생성자.
		
		this.studentNumber = studentNumber; //this를 사용하게 되면 멤버변수를 가리키게 된다. 여기서는 5행의 멤버변수를 가리킴.
		this.studentName = studentName;
		this.grade = grade;
		
	}
	
	public String showStudentInfo() {
		
		return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
	}

	
}
