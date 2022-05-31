package ch12_generic.sec11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		// HashMap ����
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// ��ü ����
		// '�̸���' Ű�� ���� : ���ο� Ű ���� �� ����� ���� ������ ���������� ��ġ
		map.put("ȫ�浿", 85);
		map.put("�̸���", 90);
		map.put("������", 80);
		map.put("�̸���", 95);	// ���� �̸��� ���� ��
		
		System.out.println("�� Entry �� : "+ map.size());
		
		// Ű ��Ʈ���� Ű ��������, Ű�� �شٿ���� value �� ����
		Set<String>keySet = map.keySet();
		for(String k : keySet) {
			System.out.println(k+":"+map.get(k));
		}
		System.out.println();
		
		// Iterator ���
		// Set<String>keySet = map.keySet();
		Iterator<String>keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next(); // Ű ����
			System.out.println(key+":"+ map.get(key));
		}
		
		System.out.println("ȫ�浿 : " + map.get("ȫ�浿"));
	}

}









