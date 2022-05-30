package ch11_api_class.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {

	public static void main(String[] args) {
		// ��¥ ���� ����
		Date now = new Date();
		
		// �ܼ� ����� ���� Date Ÿ�� now ���� , ���ڿ� ��ȯ�ؼ� ��µ� ����
		System.out.println(now);
		System.out.println(now.toString());
		
		//	String Ÿ���� ������ ������ ����
		// Date Ÿ���� String Ÿ������ ��ȯ�� �� ���ٴ� ���� �߻�
		// -> String Ÿ������ ��ȯ �ʿ�. now.toString()
		String today = now.toString();
		System.out.println(today);
		
		// SimpleDateFormat Ŭ���� �̿��ؼ� ��� ���� ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("������ E����");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("������ ���� D��° ��");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("�̴��� d��° ��");
		System.out.println(sdf.format(now));
	}

}









