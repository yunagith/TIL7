package ch12_generic.sec13;

import java.util.HashMap;

public class LoginDAO {
	public void loginCheck(HashMap<String, String> map) {
		// key�� value �����ؼ� ���
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		// id : abcd
		// passwd : 1234
	}
}
