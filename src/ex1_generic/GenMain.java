package ex1_generic;

public class GenMain {
	public static void main(String[] args) {
		
		
		GenEx<String> v1 = new GenEx<String>();  // T ==> String
		v1.setValue("abc");
		String s1 = v1.getValue();  // 게터도 스트링 타입으로 받아야 한다.
		System.out.println(s1);
		
		GenEx<Integer> v2 = new GenEx<Integer>();
		int num = 100;
		
		// 오토 박싱(auto boxing) : 기본 자료형(num)이 클래스 타입(Integer)으로 형 변환이 된 것.
		v2.setValue(num);
		
		//언박싱(unboxing) : 클래스 형태(Integer)가 기본 자료형(int)으로 들어갈 수 있도록 들어갈 수 있는 기술
		int n1 = v2.getValue();
		System.out.println(n1);
		 
		
		
	} // main

}
