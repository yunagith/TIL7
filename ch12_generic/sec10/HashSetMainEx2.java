package ch12_generic.sec10;

import java.util.HashSet;
import java.util.Set;

public class HashSetMainEx2 {

	public static void main(String[] args) {
		// HashSet �ߺ� ����Ǵ� ���
		// Member Ŭ�������� hasCode()�� equals() �޼ҵ尡 ������ ���� �ʾ���
		Set<Member>set = new HashSet<Member>();
		
		set.add(new Member("ȫ�浿",30));
		set.add(new Member("ȫ�浿",30));
		
		System.out.println("�� ��ü�� : "+set.size());
	}

}
