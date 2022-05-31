package ch12_generic.sec02;

// 제네릭 타입 클래스 생성
public class Box<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}
