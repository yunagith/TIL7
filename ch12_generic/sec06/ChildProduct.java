package ch12_generic.sec06;

// ���׸� Ÿ�� ���
// �θ� ���׸��̸� �ڽĵ� ���׸�
// �ڽ� Ŭ���� Ÿ�� �Ķ���� �ϳ� �� �߰�����
public class ChildProduct<T, M, C> extends Product<T, M> {
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
	
}
