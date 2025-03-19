package ex3_map;

import java.util.HashMap;
import java.util.Map;

public class Ex1_Map {
	public static void main(String[] args) {
		
		// map : key, value 를 하나로 묶어서 관리한다.
		// key 값을 알면 원하는 value를 바로 얻어낼 수 있으므로, 많은 양의 데이터를 검색하는데 있어서 매우 뛰어난 성능을 가지고 있다.
		
		
		// 제너릭 타입이 두개 : K-> 키(key)의 타입, V-> 얻는 값의 타입 
		// 컬렉션 중에서 유일하게 add가 아닌 put으로 값을 저장한다.
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		map1.put(1, 100);
		map1.put(2, 200);
		map1.put(3, 200);  // 중복 허용
		System.out.println( "map1의 크기 : " + map1.size() );
		System.out.println(map1);  
		
		System.out.println( map1.get(2) );  // key 1번으로 얻을 수 있는 값 출력.
		
		
		if( map1.containsKey(1) ) { // map1이 가지고 있는 열쇠 중 1번이 있는지 묻는 코드. 참이면 실행.
			System.out.println("map1에는 key1이 있다.");
		} // if
		
		if( map1.containsValue(200) ) { // map1이 가지고 있는 값을 묻는 코드.
			System.out.println("map1에는 200이라는 값이 있다.");
		} // if
		
		
		
		
		
	} // main

}
