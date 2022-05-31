package ch12_generic.sec15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsEx {
	
	//������-> ����ؼ� ����ϴ� �޼ҵ�
	static void printList(ArrayList<String>list) {
		Iterator<String>it=list.iterator();
		while(it.hasNext()) {
			String element = it.next();
			String seperator;
			
			if(it.hasNext())
				seperator ="->";
			else
				seperator="\n";
			
			System.out.println(element+seperator);
		}
	}

	public static void main(String[] args) {
		// Collections Ŭ���� ����
		ArrayList<String>  myList = new ArrayList<String>();
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add("�͹̳�����");
		myList.add("�ƹ�Ÿ");
		
		System.out.print("����Ʈ ���� : ");
		for(String movie : myList) {
			System.out.print(movie+"|");
		}
		System.out.print("\n�������� ���� : ");
		Collections.sort(myList);
		printList(myList);
		
		//�˻� 
		int index = Collections.binarySearch(myList,"��Ÿ����");
		System.out.println("��Ÿ����"+"��(��)"+(index+1)+"��° �Դϴ�.");
		
		System.out.print("\n�������� ���� : ");
		Collections.reverse(myList);
		printList(myList);
	}

		
	}


