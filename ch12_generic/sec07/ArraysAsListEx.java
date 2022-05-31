package ch12_generic.sec07;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListEx {

	public static void main(String[] args) {
		// Arrays.asList() : �������� ��ü��� ������ List ���� ����
		List<String>list1 = Arrays.asList("ȫ�浿", "�̸���", "������");
		
		for(String name : list1) {
			System.out.println(name);
		}
		
		// list2 : ���� 1,2,3 ���� �� ���
		List<Integer>list2 = Arrays.asList(1,2,3);
		
		for(Integer value : list2) {
			System.out.println(value);
		}
	}

}
