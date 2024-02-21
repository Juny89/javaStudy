package ch06;

public class UserInfoTest {

	public static void main(String[] args) {

		//UserInfo 클래스에 있는 default생성자를 이용해서 userInfo라는 객체 생성
		UserInfo userHong = new UserInfo(); 
		
		//userInfo객체에 담겨있는 userName변수에 직접 데이터 삽입.
		userHong.userName = "홍길동"; 		
		userHong.userId = "kong8380";
		
		//UserInfo 클래스내에 있는 showUserInfo() 메소드 실행.
		System.out.println(userHong.showUserInfo());
		
		
		//매개변수가 3개 있는 UserInfo클래스 사용하여 userKim이라는 객체를 생성.
		UserInfo userKim = new UserInfo("kkamimus", "12345", "최원준");
		
		//UserInfo 클래스내에 있는 showUserInfo() 메소드 실행.
		System.out.println(userKim.showUserInfo());
		
		System.out.println(userHong.showUserInfo());
		System.out.println(userKim.showUserInfo());
		
		
		/*
		 * System.out.println(userHong.userName); System.out.println(userKim.userName);
		 * 
		 * 생성자를 하나도 만들지 않으면 기본적으로 default생성자를 Java가 컴파일 과정에서 만들어 준다.
		 */		
		
	}

}
