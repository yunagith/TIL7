package ch12_generic.sec11;

public class Student {
	int sno;
	String name;
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		// Student ��ü���� Ȯ��
		if(obj instanceof Student) {
			Student std =(Student)obj;
			return(sno==std.sno)&&(name.equals(std.name));
		}else return false;
	}
	
	@Override
	public int hashCode() {
		// �й��� �̸��� ������ ������ �� ����
		return sno + name.hashCode();
	}
}
