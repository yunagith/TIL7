package ch12_generic.sec06;

public class StorageImple<T> implements Storage<T> {
	private T[] array;

	// ����� ũ�⸸ �޾Ƽ� �迭 ����
	public StorageImple(int capacity) {
	this.array = (T[])new Object[capacity];}
	@Override
	public void add(T item, int index) {
		array[index] = item;
		
	}

	@Override
	public T get(int index) {
		return array[index];
	}

}
