package ch12_generic.sec07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int maxIndex = 0;
		
		for(int i =0; i<4; i++) {
			System.out.print("�ܾ �Է��ϼ���>>");
			list.add(i,sc.next());
		}
		for(String value : list) {
			System.out.print(value+" ");
		}
		for(int i=0;i<list.size();i++) {
			if(list.get(maxIndex).length()<list.get(i).length())
				maxIndex = i;
		}
		System.out.println("\n���� �� �ܾ�� :"+ list.get(maxIndex));
		System.out.println("���� �� �ܾ��� ���̴� : "+list.get(maxIndex).length());

		sc.close();
	}
	
}
