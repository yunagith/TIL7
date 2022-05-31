package ch12_generic.sec01;

public class NonGenMain {

	public static void main(String[] args) {
		// 제네릭을 사용하지 않는 경우 : 강제 타입 변환 발생
		Box box = new Box();
		box.set("홍길동");		// 자동 타입 변환 : Stirng -> Object
		String name = (String)box.get();	// 강제 타입 변환 : Object -> String
		// get() : Object 타입 변환
		System.out.println(name);
		
		box.set(new Apple());		// 자동 타입 변환 : Apple -> Object
		Apple apple = (Apple)box.get();	// 강제 타입 변환 : Object -> Apple
	}

}
