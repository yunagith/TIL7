package ch12_generic.sec01;

public class NonGenMain {

	public static void main(String[] args) {
		// ���׸��� ������� �ʴ� ��� : ���� Ÿ�� ��ȯ �߻�
		Box box = new Box();
		box.set("ȫ�浿");		// �ڵ� Ÿ�� ��ȯ : Stirng -> Object
		String name = (String)box.get();	// ���� Ÿ�� ��ȯ : Object -> String
		// get() : Object Ÿ�� ��ȯ
		System.out.println(name);
		
		box.set(new Apple());		// �ڵ� Ÿ�� ��ȯ : Apple -> Object
		Apple apple = (Apple)box.get();	// ���� Ÿ�� ��ȯ : Object -> Apple
	}

}
