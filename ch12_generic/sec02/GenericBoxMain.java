package ch12_generic.sec02;

public class GenericBoxMain {

	public static void main(String[] args) {
		// 제네릭 타입 예제
		Box<String> box1= new Box<String>();
		box1.setT("hello");
		String str = box1.getT();
		System.out.println(str);
		
		// 구체적 타입 : Integer
		Box<Integer> box2 =new Box<Integer>();
		box2.setT(6);
		int value = box2.getT();
		System.out.println(value);

	}

}
