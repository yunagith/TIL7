package ch12_generic.sec04;

public class GenMethodMain {

	public static void main(String[] args) {
		// ���׸� �޼ҵ� ����
		// ���׸� �޼ҵ� ȣ�� ��� 2����
		// (1) ȣ���� �� ��ü������ Ÿ�� ����
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
	
		// (2) Ÿ�� ���� : <String> ����
		Box<String> box2 = Util.boxing("ȫ�浿");
		String strValue = box2.get();
		System.out.println(strValue);
	}

}
