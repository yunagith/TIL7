package ch12_generic.sec11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx3 {

	public static void main(String[] args) {
		// HashMap ��������
		Scanner sc = new Scanner(System.in);
		
		Map<String, String>map = new HashMap<String, String>();
		map.put("apple", "���");
		map.put("summer", "����");
		map.put("candy", "����");
		map.put("school", "�б�");
		map.put("bus", "����");
		map.put("water", "��");

		while(true) {
			System.out.println("ã����� �ܾ��?");
			String eng = sc.next();
			if(eng.equals("exit")) {
				System.out.println("�����մϴ�..."); break;
			}
			// �ؽøʿ��� 'Ű' : eng, �� : kor
			String kor = map.get(eng);
			if(kor==null)
				System.out.println(eng+"�� ���� �ܾ��Դϴ�.");
			else
				System.out.println(kor);
		}
		sc.close();
		
		
	}

}
