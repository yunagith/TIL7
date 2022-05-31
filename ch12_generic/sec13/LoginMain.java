package ch12_generic.sec13;

public class LoginMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// LoginController의 loginCheck()호출하면서 id, passwd 전달
		LoginController lc = new LoginController();
		lc.loginCheck(new Member("abcd","1234"));
	}

}
