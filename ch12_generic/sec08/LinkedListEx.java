package ch12_generic.sec08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		// LinkedList vs ArrayList ���� �ð� ����
		List<String> listArray = new ArrayList<String>();
		List<String>listLinkedList = new LinkedList<String>();
		
		ArrayList<String>arrayList = new ArrayList<String>();
		LinkedList<String> linkedList = new LinkedList<String>();
		
		long startTime, endTime;
		
		startTime = System.nanoTime();
		for(int i=0;i<10000;i++) {
			listArray.add(0, String.valueOf(i));
			
		}
		endTime = System.nanoTime();
		System.out.println("listArray �ɸ��ð� : "+(endTime-startTime)+"ns");
		
		startTime = System.nanoTime();
		for(int i=0;i<10000;i++) {
			listLinkedList.add(0, String.valueOf(i));
			
		}
		endTime = System.nanoTime();
		System.out.println("listLinkedList �ɸ��ð� : "+(endTime-startTime)+"ns");
	
		startTime = System.nanoTime();
		for(int i=0;i<10000;i++) {
			arrayList.add(0, String.valueOf(i));
			
		}
		endTime = System.nanoTime();
		System.out.println("arrayList �ɸ��ð� : "+(endTime-startTime)+"ns");
	
		startTime = System.nanoTime();
		for(int i=0;i<10000;i++) {
			linkedList.add(0, String.valueOf(i));
			
		}
		endTime = System.nanoTime();
		System.out.println("linkedList �ɸ��ð� : "+(endTime-startTime)+"ns");
	}

}
