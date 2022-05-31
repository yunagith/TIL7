package ch12_generic.sec05;

public class MultiGenMethodMain {

	public static void main(String[] args) {
		// ��Ƽ Ÿ�� ���׸� �޼ҵ� ����
		// (1) ȣ���� �� ��ü������ Ÿ�� ����
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "���");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "���");
		
		boolean result1 = Util.<Integer, String>compare(p1, p2);
		
		if(result1) {
			System.out.println("�������� ������ ��ü�Դϴ�.");
		} else {
			System.out.println("�������� �������� ���� ��ü�Դϴ�.");
		}
		// (2) Ÿ�� ����
		Pair<String, String> p3 = new Pair("user1", "ȫ�浿");
		Pair<String, String> p4 = new Pair("user2", "ȫ�浿");
		
		boolean result2 = Util.compare(p3, p4);
		
		if(result2) {
			System.out.println("�������� ������ ��ü�Դϴ�.");
		} else {
			System.out.println("�������� �������� ���� ��ü�Դϴ�.");
		}
	}

}
