package ch12_generic.sec12;

public class LoginMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "abcd";
		String passwd = "1234";
		
		// LoginController의 loginCheck()호출하면서 id, passwd 전달
		LoginController lc = new LoginController();
		lc.loginCheck(id, passwd);
	}

}
