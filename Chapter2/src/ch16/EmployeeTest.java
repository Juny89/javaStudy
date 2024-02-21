package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		
		System.out.println(Employee.getSerialNum()); //static변수나 static메소드의 경우 클래스 이름(Employee)로 참조해서 사용한다
		
		
		Employee employeeKim = new Employee();
		
		employeeKim.setEmployeeName("김유신");
		//employeeKim.serialNum++; //staitc변수로 선언한 serialNum은 두개의 인스턴스(객체) 김유신, 이순신이 하나의 메모리를 공유한다
		
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId());
	
	}

}
