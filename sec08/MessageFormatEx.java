package ch11_api_class.sec08;

import java.text.MessageFormat;

public class MessageFormatEx {

	public static void main(String[] args) {
		// MessageFormat Ŭ���� ����
		String id = "abcd";
		String name = "ȫ�浿";
		String tel = "010-1234-5678";
		
		String text = "ȸ�� ID : {0}, ȸ�� �̸� : {1}, ȸ�� ��ȭ : {2}";
		String result = MessageFormat.format(text, id, name, tel);
		System.out.println(result);
		
		System.out.println();
		String sql = "insert into member values({0},{1},{2})";
		Object[] arguments = {"'abcd'", "'�̸���'", "'010-1111-1111'"};
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);

	}

}
