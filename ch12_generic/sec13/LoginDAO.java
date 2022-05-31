package ch12_generic.sec13;

import java.util.HashMap;

public class LoginDAO {
	public void loginCheck(HashMap<String, String> map) {
		// key와 value 추출해서 출력
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		// id : abcd
		// passwd : 1234
	}
}
