package ch12_generic.sec12;

import java.util.HashMap;
import java.util.Map;

public class LoginController {
	public void loginCheck(String id, String passwd) {
		// HashMap에 저장
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("passwd", passwd);
		
		// LoginDAO에게 map 전달
		LoginDAO dao = new LoginDAO();
		dao.loginCheck(map);
		
	}
}
