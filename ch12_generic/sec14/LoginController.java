package ch12_generic.sec14;

import java.util.HashMap;
import java.util.Map;

public class LoginController {
	public void loginCheck(Member mem) {
		// HashMap�� ����
		HashMap<String, Member> map = new HashMap<String, Member>();
		map.put("mem", mem);
		
		// LoginDAO���� map ����
		LoginDAO dao = new LoginDAO();
		dao.loginCheck(map);
		
	}
}
