package ch12_generic.sec04;

public class Util {
	// ���׸� �޼ҵ�
	// <T> : Ÿ�� �Ķ���� (�� �Ķ���͸� �Ű������� ���� Ÿ������ �����)
	public static<T> Box<T> boxing(T t){
		Box<T>box = new Box<T>();
		box.set(t);
		return box;
	}
}
