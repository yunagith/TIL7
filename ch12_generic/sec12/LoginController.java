package ch12_generic.sec12;

import java.util.HashMap;
import java.util.Map;

public class LoginController {
	public void loginCheck(String id, String passwd) {
		// HashMap�� ����
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("passwd", passwd);
		
		// LoginDAO���� map ����
		LoginDAO dao = new LoginDAO();
		dao.loginCheck(map);
		
	}
}
