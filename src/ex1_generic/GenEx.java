package ex1_generic;

public class GenEx<T> {
	
	// 제너릭 프로그래밍
	// : 일반적인 변수나 메서드를 작성하되, 이 코드를 다양한 타입의 객체에 대하여 재사용이 용이하도록 설계된, 클래스를 이용하는 객체지향 기법.
	// 클래스 이름 < > : generic 타입 생성.
	// 기본 자료형은 쓸 수 없다. 반드시 클래스 타입의 자료형이 들어가야 한다. 래퍼 클래스
	
	
	
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
	
	
	

}
