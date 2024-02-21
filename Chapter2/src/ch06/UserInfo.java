package ch06;

public class UserInfo {
	
	public String userId;
	public String userPassWord;
	public String userName;
	public String userAdress;
	public String phoneNumber;
	
	public UserInfo() {}; //매개변수가 없는 생성자 생성.
//	public UserInfo()
	
	public UserInfo(String userId, String userPassWord, String userName) { //매개변수가 3개 있는 생성자
		
		this.userId = userId;	//this는 해당 클래스의 매개변수를 가리킨다.
		this.userPassWord = userPassWord;
		this.userName = userName;
		
	}
	
	public String showUserInfo() {	//showUserInfo()라는 이름을 가진 메서드.
		return "고객님의 아이디는 " + userId + "이고, 등록된 이름은 " + userName + "입니다."; 
	}
	
}
