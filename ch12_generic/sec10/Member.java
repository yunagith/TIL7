package ch12_generic.sec10;

//HashSet �ߺ� ���� �� �ǵ���
// Member Ŭ�������� hasCode()�� equals() �޼ҵ尡 ������

public class Member {
	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return member.name.equals(name)&&(member.age==age);
			}else {
				return false;
			}
	}
	@Override
	public int hashCode() {
		return name.hashCode()+age;
	}
	
}
