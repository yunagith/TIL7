package ch12_generic.sec02;

public class GenericBoxMain {

	public static void main(String[] args) {
		// ���׸� Ÿ�� ����
		Box<String> box1= new Box<String>();
		box1.setT("hello");
		String str = box1.getT();
		System.out.println(str);
		
		// ��ü�� Ÿ�� : Integer
		Box<Integer> box2 =new Box<Integer>();
		box2.setT(6);
		int value = box2.getT();
		System.out.println(value);

	}

}
