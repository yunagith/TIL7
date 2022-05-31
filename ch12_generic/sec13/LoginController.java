package ch12_generic.sec13;

import java.util.HashMap;
import java.util.Map;

public class LoginController {
	public void loginCheck(Member mem) {
		// HashMap에 저장
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", mem.getId());
		map.put("passwd", mem.getPasswd());
		
		// LoginDAO에게 map 전달
		LoginDAO dao = new LoginDAO();
		dao.loginCheck(map);
		
	}
}
