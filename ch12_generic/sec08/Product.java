package ch12_generic.sec08;

public class Product {
	String name;
	int price;
	String num;
	public Product(String name, int price, String num) {
		super();
		this.name = name;
		this.price = price;
		this.num = num;
		
	}
	@Override
	public String toString() {
		return "��ǰ�� : " + name + "\n���� : " + price +"��"+ "\n��ǰ��ȣ :" + num;
	}
}
