package ch12_generic.sec03;

public class GenProductMain {

	public static void main(String[] args) {
		// ��Ƽ Ÿ�� �Ķ���� ����
		Product<Tv, String> prd1 = new Product<Tv, String>();
		
		prd1.setKind(new Tv());
		prd1.setModel("����ƮTV");
		
		Tv tv = prd1.getKind();
		String tvModel = prd1.getModel();
		
		System.out.println(tvModel);
			
		// Car ��ü ���� - �� : ����
		Product<Car, String> prd2 = new Product<Car, String>();
		
		prd2.setKind(new Car());
		prd2.setModel("����");
		
		Car car = prd2.getKind();
		String carModel = prd2.getModel();
		
		System.out.println(carModel);
		
				
				
	}

}
