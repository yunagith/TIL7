package ch12_generic.sec06;

// 제네릭 타입 상속
// 부모가 제네릭이면 자식도 제네릭
// 자식 클래스 타입 파라미터 하나 더 추가했음
public class ChildProduct<T, M, C> extends Product<T, M> {
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
	
}
