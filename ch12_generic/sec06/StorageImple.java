package ch12_generic.sec06;

public class StorageImple<T> implements Storage<T> {
	private T[] array;

	// 저장소 크기만 받아서 배열 생성
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
