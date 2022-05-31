package ch12_generic.sec07;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// ArrayList list 예제
		ArrayList list = new ArrayList();
		// 리스트 끝에 항목 추가 : add()
		// 다양한 타입의 데이터 저장 가능
		list.add(100);
		list.add("홍길동");
		list.add(3.14159);
		list.add("자바");
		list.add("자바");	// 중복 저장 가능
		
		// 항목 값 반환 : get(인덱스)
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		// 특정 위치에 항목 추가 : 한칸씩 다음으로 위치 이동
		list.add(0,"변경");
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		// 특정 인덱스의 항목 삭제
		list.remove(1); // 두번째 항목 삭제
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i));
	}

}
}