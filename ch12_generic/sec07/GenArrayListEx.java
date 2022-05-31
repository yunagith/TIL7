package ch12_generic.sec07;

import java.util.ArrayList;
import java.util.List;

public class GenArrayListEx {

	public static void main(String[] args) {
		// ArrrayList : ���׸� Ÿ���� ���
		List<String>list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("MyBatis");
		// list.add(100); // ����! : String Ÿ���� �ƴϸ� ����
		
		System.out.println("�� ��ü �� :"+ list.size());
		
		System.out.println();
		for(int i=0;i<list.size();i++) {
			System.out.println(i+":"+list.get(i));
		}
		System.out.println();
		// Database ���
		System.out.println("2: "+list.get(2));
		
		list.remove(2);
		list.remove(2);
		list.remove("MyBatis");
		
		System.out.println();
		
		for(String value : list) {
			System.out.println(value);
		}
		// �� �׸�(��ü)�� ���� ���
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)+":"+list.get(i).length());
		}
		for(String value : list) {
			System.out.println(value+":"+value.length());
		}
	}

}






