package ch12_generic.sec06;

public class ChildProductStorageMain {

	public static void main(String[] args) {
		// ���׸� Ÿ���� ��Ӱ� ���� ����
		ChildProduct<Tv,String, String> prd = new ChildProduct<>();
		prd.setKind(new Tv());
		prd.setModel("SmartTv");
		prd.setCompany("�Ｚ");
		
		System.out.println(prd.getModel());
		System.out.println(prd.getCompany());
		
		// �������̽� Ÿ�Կ� ���� ��ü ����
		Storage<Tv> storage = new StorageImple<Tv>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
		

	}

}
