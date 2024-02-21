package ch16;

public class Employee {

	private static int serialNum = 1000; //스태틱 변수 선언
	
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() { //default생성자에 필요에 의하면 코드를 넣을 수 있다.
		
		serialNum++; 	//defalut
		employeeId = serialNum;
	}
	
	public static int getSerialNum() {	//스태틱 메소드 생성
		return serialNum;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	};
	
	
	
	
	
}
