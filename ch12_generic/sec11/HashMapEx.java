package ch12_generic.sec11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		// HashMap 예제
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 객체 저장
		// '이몽룡' 키가 동일 : 새로운 키 새로 안 만들고 기존 값으로 마지막으로 대치
		map.put("홍길동", 85);
		map.put("이몽룡", 90);
		map.put("성춘향", 80);
		map.put("이몽룡", 95);	// 앞의 이몽룡 덮어 씀
		
		System.out.println("총 Entry 수 : "+ map.size());
		
		// 키 세트에서 키 가져오고, 키에 해다오디는 value 값 추출
		Set<String>keySet = map.keySet();
		for(String k : keySet) {
			System.out.println(k+":"+map.get(k));
		}
		System.out.println();
		
		// Iterator 사용
		// Set<String>keySet = map.keySet();
		Iterator<String>keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next(); // 키 추출
			System.out.println(key+":"+ map.get(key));
		}
		
		System.out.println("홍길동 : " + map.get("홍길동"));
	}

}









