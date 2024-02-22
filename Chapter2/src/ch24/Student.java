package ch24;

import java.util.ArrayList;

public class Student {
	
	/*멤버변수*/
	private int studentId;
	private String studentName;
	/*ArrayList 사용하여 sujectList 객체 생성<자료형은 Subject>*/
	ArrayList<Subject> subjectList;

	/*매개변수가 2개 존재하는 생성자*/
	Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName= studentName;
		subjectList = new ArrayList<>();
	}

	/*addSubject 메서드*/
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setPoint(score);
		
		//위에서 셋해준 subject내용을 subjectList에 담아준다
		subjectList.add(subject);
	}
	
	/*출력 메서드*/
	public void showStudentInfo() {
		
		int total = 0;
		for(Subject subject : subjectList) {
			total += subject.getPoint();
			System.out.println(studentName + "학생의 " + subject.getName() + "과목 성적은 " + subject.getPoint() + "입니다.");	
		}
		System.out.println(studentName + "학생의 총점은 " + total + " 입니다.");
	}
		
	/*getter setter 메서드*/
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
