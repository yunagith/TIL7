package ch12_generic.sec14;

public class LoginMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// LoginController�� loginCheck()ȣ���ϸ鼭 id, passwd ����
		LoginController lc = new LoginController();
		lc.loginCheck(new Member("abcd","1234"));
	}

}
