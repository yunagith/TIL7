package ch12_generic.sec07;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// ArrayList list ����
		ArrayList list = new ArrayList();
		// ����Ʈ ���� �׸� �߰� : add()
		// �پ��� Ÿ���� ������ ���� ����
		list.add(100);
		list.add("ȫ�浿");
		list.add(3.14159);
		list.add("�ڹ�");
		list.add("�ڹ�");	// �ߺ� ���� ����
		
		// �׸� �� ��ȯ : get(�ε���)
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		// Ư�� ��ġ�� �׸� �߰� : ��ĭ�� �������� ��ġ �̵�
		list.add(0,"����");
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		// Ư�� �ε����� �׸� ����
		list.remove(1); // �ι�° �׸� ����
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i));
	}

}
}