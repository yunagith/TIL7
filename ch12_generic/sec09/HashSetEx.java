package ch12_generic.sec09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		// HashSet ����
		Set<String>set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");	// �ߺ� ���� �� ��
		set.add("MyBatis");
		
		System.out.println("�� ��ü �� : "+ set.size());
		
		Iterator<String>it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+"\t");
		}
		
		set.remove("JDBC");
		set.remove("MyBatis");
		
		System.out.println();
		
		System.out.println("�� ��ü�� : "+set.size());
		
		for(String e : set) {
			System.out.println(e);
		}
		
		set.clear(); // ��� ��ü �����ϰ� ���
		if(set.isEmpty()) {
			System.out.println("��� ����");
		}
	}

}
