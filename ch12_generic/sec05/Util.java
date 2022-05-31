package ch12_generic.sec05;

public class Util {
	// ���׸� �޼ҵ�
	public static <K, V> boolean compare(Pair <K, V>p1, Pair<K, V> p2) {
		// p1 �� p1�� key �� �� ���
		boolean keyComp = p1.getKey().equals(p2.getKey());
		// p1�� p2 value �� �� ���
		boolean valueComp = p1.getValue().equals(p2.getValue());
		return keyComp && valueComp;	// �� �� ���̸� true ��ȯ
	}
}
