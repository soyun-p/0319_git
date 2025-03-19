package ex2_set;

import java.util.Arrays;
import java.util.HashSet;

public class Ex1_set {
	public static void main(String[] args) {
		
		
		// 컬렉션(collection) : 많은 수의 데이터를 그 사용목적에 적합한 자료구조로 묶어서 하나로 그룹에 한 객체.
		// -- 대표적인 컬렉션 객체들 --
		// 1) Set
		// 2) Map
		// 3) List
		
		
		// set은 특정 코드에서 중복된 값의 허용이 있어서는 안될 때 사용.
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("홍길동");
		hs1.add("김길동");
		hs1.add("유비");
		hs1.add("유비");
		
		System.out.println( hs1.size() );
		System.out.println( hs1 );  
		
		System.out.println("--------------------------");
		
		hs1.remove("홍길동");
		System.out.println(hs1);
		System.out.println( hs1.size() );
		
		// set은 배열과 달리 인덱스가 없다. 대신 add를 통해 방을 늘릴 수 있기 때문에 방 갯수의 제약이 없다.
		// 순서대로 add 했다고 해도, 그 주소값도 차례대로 정해진다는 보장은 없다. 따라서 출력해도 순서가 섞여서 출력될 수 있다.
		// 중복된 값을 넣어도 한 번만 출력되고, hs1의 사이즈 또한 3으로 유지된다. 따라서 배열의 있는 length가 없고, size를 사용한다.
		
		
		// set -> 배열
		String[] sArr = hs1.toArray( new String[0] );  // 0으로 인덱스 값 해놓으면 알아서 저장됨.
		// sArr의 모든 배열 출력
		for(int i = 0; i < sArr.length; i++) {
			System.out.print(sArr[i] + " ");
			System.out.println();
		} // for
		
		
		System.out.println("--------------------------");
		
		
		sArr[0] = "관우";
		
		// 배열 -> set
		hs1 = new HashSet<String>( Arrays.asList(sArr) );
		System.out.println(hs1);
		
		
		
		
		
		
		
		
	} // main

}
