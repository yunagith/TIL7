package ch12_generic.sec11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx3 {

	public static void main(String[] args) {
		// HashMap 연습문제
		Scanner sc = new Scanner(System.in);
		
		Map<String, String>map = new HashMap<String, String>();
		map.put("apple", "사과");
		map.put("summer", "여름");
		map.put("candy", "사탕");
		map.put("school", "학교");
		map.put("bus", "버스");
		map.put("water", "물");

		while(true) {
			System.out.println("찾고싶은 단어는?");
			String eng = sc.next();
			if(eng.equals("exit")) {
				System.out.println("종료합니다..."); break;
			}
			// 해시맵에서 '키' : eng, 값 : kor
			String kor = map.get(eng);
			if(kor==null)
				System.out.println(eng+"는 없는 단어입니다.");
			else
				System.out.println(kor);
		}
		sc.close();
		
		
	}

}
