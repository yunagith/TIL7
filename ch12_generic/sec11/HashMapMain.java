package ch12_generic.sec11;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {

	public static void main(String[] args) {
		/*Map<String, Integer>map = new HashMap<String, Integer>();
		map.put("kim", 100);
		map.put("kim", 100);*/
		// String�� ���ڿ��� ���� ��� ���� ��ü�� �� �� �ֵ���
		// hashCode()�� equals() �޼ҵ尡 ������ �Ǿ� ����
		// "kim" �����Ƿ� ���� ��ü�� �ν�
		// System.out.println("�� Entry �� : "+map.size()); //1
		
		Map<Student, Integer>map = new HashMap<Student, Integer>();
		map.put(new Student(1,"ȫ�浿"), 95);
		map.put(new Student(1,"ȫ�浿"), 95);
		
		System.out.println("�� Entry �� : "+map.size()); //2
		
		
	}

}
