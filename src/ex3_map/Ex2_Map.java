package ex3_map;

import java.util.HashMap;
import java.util.Map;

public class Ex2_Map {
	public static void main(String[] args) {
		
		
		Map<String, Character> map1 = new HashMap<String, Character>();
		map1.put("key1", 'A');
		map1.put("key2", 'C');
		map1.put("key3", 'A');  // 중복 허용. 출력도 가능.
		
		// 기존에 사용중인 키 값과 동일한 키를 사용한다면 내용이 갱신된다. (수정으로 간주)
		map1.put("key1", 'B');  // 키가 중복되는 것은 불가능. 따라서 원래 키에 있던 값이 수정됨. 
		
		System.out.println( map1.size() );
		System.out.println(map1);
		
		// 지우고 싶은 키 값을 입력. 해당 키가 가지고 있는 방(키와 값을 포함)을 없애버림.
		map1.remove("key1"); 
		
		System.out.println( map1.get("key2") );
		
		
		
		
		
	} // main

	
	
	
}
