package ch12_generic.sec08;

import java.util.ArrayList;

public class ArrayListProductMain {

	public static void main(String[] args) {
	ArrayList<Product>list = new ArrayList<Product>();
		
	Product p1 = new Product("����",1000,"123-123");
	Product p2 = new Product("��Ƽ��",2000,"456-456");
	Product p3 = new Product("�ҵ���",1500,"789-789");
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		System.out.println();
		for(Product p : list) {
			System.out.println(p);
		}

	}

}
