package ch12_generic.sec14;

import java.util.HashMap;

public class LoginDAO {
	public void loginCheck(HashMap<String, Member> map) {
		System.out.println("id : "+map.get("mem").getId());
		System.out.println("passwd"+map.get("mem").getPasswd());
		}
		
		// id : abcd
		// passwd : 1234
	}

