package ch18;

public class Company {//싱글톤 패턴 실습

	private static Company instance = new Company();
	
	private Company() {}; //외부에서 Company객체를 계속 생성할 수 없도록 private 디폴트 생성자 선언
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company(); //만약을 대비하여 방어코드 작성
		}
		return instance;
	}
	
}
